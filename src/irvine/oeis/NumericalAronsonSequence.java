package irvine.oeis;

import java.util.HashMap;

import irvine.math.z.Z;

/**
 * Earliest sequence with a(a(n))=b(n), where b(n) is some underlying sequence.
 * @author Georg Fischer
 */
public class NumericalAronsonSequence implements SequenceWithOffset {

  private static int sDebug = 0;
  protected MemorySequence mSeq; // underlying sequence
  protected int mN; // current index
  protected int mOffset; // starting index
  protected int mAttribs; // bit mask for features; low nibble may be start value
  protected static final int EARLY = 0x10; // "Earliest sequence ..."
  protected static final int INCR = 0x20; // "...  being monotonically increasing"
  protected static final int START = 0x30; // low nibble contains start value
  protected HashMap<Integer, Z> mHmap; // n -> a(n)
  protected HashMap<Z, Integer> mImap; // a(n) -> n
  private static final int MAX_BITS = 12;
  /**
   * Constructor with parameters.
   * @param offset first index
   * @param seq underlying sequence
   * @param attribs bit mask for attributes
   */
  public NumericalAronsonSequence(final int offset, final Sequence seq, final int attribs) {
    mSeq = MemorySequence.cachedSequence(seq);
    mHmap = new HashMap<>(1024);
    mImap = new HashMap<>(1024);
    mOffset = offset;
    mAttribs = attribs;
    mN = -1;
    while (mN < mOffset - 1) {
      store(mN++, Z.ZERO);
    }
  }

  /**
   * Stores a new term a(n) in both HashMaps.
   * @param n index
   * @param an term
   */
  private void store(final int n, final Z an) {
    mHmap.put(n, an);
    mImap.put(an, n);
  }
  
  /**
   * Compute the next term in a chain.
   * @param n index
   * @param an a(n)
   * @return b(n) &lt;= 4096, or -1 if b(n) is bigger
   * For example <code>chain(4, 6): a(4):=6; a(6)=a(a(4))=b(4)=5 -&gt; chain(5, 6)</code>
   */
  private boolean chain(final int n, final int an) {
    // if (sDebug >= 1) { System.out.println("    start chain(" + n + "," + an + ")"); }
    if (mHmap.get(n) == null) { // if (sDebug >= 1) { System.out.println("      a(" + n + ") := " + an); }
      store(n, Z.valueOf(an));
      final Z bn = mSeq.a(n); // b(n)
      if (n != an && bn.bitLength() <= MAX_BITS) { // continue the chain
        chain(an, bn.intValue());
      } else {
        mHmap.put(an, bn);
        //bn = Z.NEG_ONE; // end of  chain
      }
    } else { // if (sDebug >= 1) { System.out.println("      a(" + n + ") already computed"); }
    }
    // if (sDebug >= 1) { System.out.println("    end   chain(" + n + "," + an + ")"); }
    return true;
  }

  @Override
  public int getOffset() {
    return mOffset;
  }

  @Override
  public Z next() {
    ++mN;
    final int n = mN;
    Z result;
    if (mN == mOffset && (mAttribs & START) == START) {
      result = Z.valueOf(mAttribs & 0x0f);
      store(n, result);
      return result;
    }
    result = mHmap.get(n); // if (sDebug >= 1) { System.out.println("\n--determine a(" + n + "): " + (result == null ? "null" : result.toString())); }
    if (result == null) { // a(n) does not yet exist
      // now determine the earliest candidate
      boolean busy = true;
      int cand = mOffset; // is this a candidate for a(n)?
      if (n > mOffset && (mAttribs & INCR) == INCR) {
        cand = mHmap.get(n - 1).intValue() + 1;
      } else {
        while (busy && cand < n) {
          final Z acand = mHmap.get(cand);
          if (acand != null) { // if (sDebug >= 1) { System.out.println("    try cand < n:" + cand + " -> a(cand):" + acand); }
            if (acand.equals(mSeq.a(n))) {
              result = acand; // if (sDebug >= 1) { System.out.println("      = b(n), accept " + result); }
              busy = false;
            } else { // if (sDebug >= 1) { System.out.println("      != b(n)"); }
            }
          } else { // if (sDebug >= 1) { System.out.println("    try cand:" + cand + " -> a(cand) = null"); }
          } 
          ++cand;
        } // while < n
        
        if (busy) { // cand == n here
          final Z bcand = mSeq.a(cand); // if (sDebug >= 1) { System.out.println("    try cand = n:" + cand + " -> b(cand):" + bcand); }
          if (Z.valueOf(cand).equals(bcand)) {
            result = bcand; // if (sDebug >= 1) { System.out.println("      = b(n), accept " + result); }
            busy = false;
          } else { // if (sDebug >= 1) { System.out.println("      != b(n)"); }
            ++cand;
          }
        }
      }
      if (busy) { // cand == n + 1 here
        final Z bn = mSeq.a(n); // if (sDebug >= 1) { System.out.println("    try cand = n+1:" + cand + " -> b(n):" + bn); }
        result = Z.valueOf(cand); // if (sDebug >= 1) { System.out.println("    try cand > n:" + cand + ", result:" + result); }
        if (n > 0) {
          if (result.equals(bn)) {
            ++cand;
            result = Z.valueOf(cand); // if (sDebug >= 1) { System.out.println("    increase because a(cand)=p(cand): " + cand); }
          }
          while (mImap.get(result) != null) {
            ++cand;
            result = Z.valueOf(cand); // if (sDebug >= 1) { System.out.println("    increase because a(cand) exists: " + cand); }
          } // while
          // if (sDebug >= 1) { System.out.println("    accept cand > n:" + result); }
        }
        busy = false;
      }
      if (result.bitLength() <= MAX_BITS) { // start a chain
        chain(n, result.intValue());
      } 
    } // a(n) did not yet exist
    // if (sDebug >= 1) { System.out.println("  result:" + result); }
    return result;
  }

  /*
   * Test method
   * @param args command line arguments:
   * <code>[-a attribs] [-b] [-d debug] [-n maxterms] [-o offset] [-s aseqno]</code>
   */
//  public static void main(final String[] args) {
//    int attribs = EARLY;
//    boolean bfile = false;
//    int maxTerms = 16;
//    int offset = 0;
//    Sequence bseq = null;
//    if (args.length == 0) { // no arguments
//      System.out.println("java -cp joeis.jar irvine.oeis.NumericalAronsonSequence "
//          + "[-a attribs] [-b] [-d debug] [-n maxterms] [-o offset] [-s aseqno]\n");
//    } else {
//      sDebug = 0;
//      int iarg = 0;
//      while (iarg < args.length) { // evaluate options
//        try {
//          switch (args[iarg++]) {
//            case "-a":
//              attribs = Integer.parseInt(args[iarg++]);
//              break;
//            case "-b":
//              bfile = true;
//              break;
//            case "-d":
//              sDebug = Integer.parseInt(args[iarg++]);
//              break;
//            case "-n":
//              maxTerms = Integer.parseInt(args[iarg++]);
//              break;
//            case "-o":
//              offset = Integer.parseInt(args[iarg++]);
//              break;
//            case "-s":
//              String aseqno = args[iarg++];
//              final String className = "irvine.oeis.a" + aseqno.substring(1, 4) + '.' + aseqno;
//              bseq = (Sequence) Class.forName(className).getDeclaredConstructor().newInstance();
//              break;
//            default:
//              break;
//          }
//        } catch (final Exception exc) {
//          System.err.println(exc.getMessage());
//          exc.printStackTrace();
//        }
//      } // while options
//    }
//    NumericalAronsonSequence aseq = new NumericalAronsonSequence(offset, bseq, attribs);
//    String sep = "\t";
//    if (! bfile) {
//      System.out.print("A000000\t" + offset);
//    }
//    int n = 0;
//    while (n < maxTerms) {
//      if (bfile) {
//        System.out.println(n + " " + aseq.next().toString());
//      } else {
//        System.out.print(sep + aseq.next().toString());
//      }
//      sep = ",";
//      ++n;
//    } // while n
//    if (! bfile) {
//      System.out.println();
//    }
//  } // main

}
