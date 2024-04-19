package irvine.oeis.a055;

import java.util.ArrayList;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.Sequence;

/**
 * A055187 Cumulative counting sequence: method A (adjective-before-noun)-pairs with first term 1.
 * @author Georg Fischer
 */
public class A055187 extends AbstractSequence {

  // Generate OEIS A030707, A055187, A217760 && related
  // "cumulative counting" sequences as defined by Clark Kimberling.
  // http://faculty.evansville.edu/ck6/integer/unsolved.html, Problem 4
  // @(#) Id
  // 2022-01-13: debug=98 -> seq4 format
  // 2018-04-20, Georg Fischer (previosu version in cumulcount2.pl)
  //------------------------------------------------------
  // Comment from A217760:
  //   Write 0 followed by segments defined inductively as follows: each segment
  //   tells how many times each previously written integer occurs, in the order
  //   of first occurrence.  This is Method A (adjective-before-noun pairs); for
  //   Method B (noun-before-adjective), see A055168.
  // Example:
  //   Start with 0, followed by the adjective-noun pair 1, 0; followed by
  //   adjective-noun pairs 2, 0 then 1, 1; etc. Writing the pairs vertically,
  //   the initial segments are
  //   0.|.1.|.2 1.|.3 3 1.|.4 5 2 2.|.5 6 5 3 1 1.|.6 9 6 5 2 4 1.|.7 11 8 6 4 6 4 1
  //   ..|.0.|.0 1.|.0 1 2.|.0 1 2 3.|.0 1 2 3 4 5.|.0 1 2 3 4 5 6.|.0 1  2 3 4 5 6 9
  //
  // Usage:
  //   perl cumulcount.pl -m method -r row -n noeis -l len -a appear -o offset -s start -p parm -w with0 -d debug
  //       All parameters are optional && have a default value:
  //       method = "A" (attribute over noun; default)
  //                "B" (noun over attribute)
  //                "D" (new, distinct elements)
  //                "I" (inverse, first occurrence of a number) - no longer supported
  //                "J" (next term which is greater than all previous)
  //                "K" (next position where term is greater than all previous)
  //                "N" (number of new elements in segment)
  //                "P" (positions of small numbers (parm))
  //                "S" (sum of terms in segment n)
  //                "T" (number of terms in segment n)
  //       row =  3 (count in both rows,    output both; default)
  //                 1 (count in both rows,    output 1st)
  //                 2 (count in both rows,    output 2nd)
  //                 5 (count in 1st row only, output 1st)
  //                 6 (count in 1st row only, output 2nd)
  //       noeis = "030707|055187|217760 ..." (OEIS number without "A", default "030707")
  //       len = length of sequence to be generated (default: 256)
  //       appear = "io" (increasing order; default)
  //                "do" (decreasing order)
  //                "fa" (order of first appearance)
  //       first = 0, 2 (first index in segment[4095])
  //       offset = 0, 1 (index f 1st b-file entry, default: 1)
  //       start = starting value for a(1): 0, 1 (default), 3, 4, 5
  //       parm = 2nd parameter (for rule "P"): 1, 2, 3, 4
  //       with0 =  0 (0 is not counted for neither attr nor noun)
  //                 1 (0 is counted for attr only)
  //                 2 (0 is counted for noun only)
  //                 3 (0 is counted for both attr && noun)
  //       debug = 0 (none; default)
  //                1 (with segments)
  //--------------------------------------------------------
  private static int sDebug;
  private final int mAppear;
  private int mFirst;
  private final String mMethod;
  private final int mParm;
  private final int mRow; // count in both rows,    output both; default
  private final int mStart;
  private final int mWith0;
  private int mSegNo;
  private final ArrayList<Integer> mSegment;
  // mSegment[i+0] = attribute, how often (i = 1, 3, 5 ..)
  // mSegment[i+1] = noun, which number is counted,
  // always this order, increasing nouns, always complete with zero attributes
  private final ArrayList<Integer> mCount;  // temporary copy of the attributes
  private final ArrayList<Integer> mFirstApp; // 1st appearance of a noun
  private final ArrayList<Integer> mSeqLen; // cumulative length of sequence so far, indexed with mSegNo
  private final ArrayList<Integer> mResult; // buffer for next
  private int mResIx; // next index in mResult to be consumed by next()
  private int mCurMax; // for methods J, K
  private int mK;
  private int mK2;

  /** Construct the sequence. */
  public A055187() {
    this(1, "A", 1, 3, 3, 0, 2, 0);
  }

  protected A055187(final int offset, final String method, final int start,
                 final int appear, final int row, final int first, final int with0, final int parm) {
    super(offset);
    mMethod = method;
    mStart = start;
    mCurMax = mStart - 1;
    mAppear = appear;
    mRow = row;
    mFirst = first;
    mWith0 = with0;
    mParm = parm;
    mResIx = 0;
    mSegNo = 0;
    mFirstApp = new ArrayList<>();
    mCount = new ArrayList<>();
    mResult = new ArrayList<>();
    mSegment = new ArrayList<>();
    mSeqLen = new ArrayList<>();
    // first segment
    for (int noun = 0; noun < mStart; ++noun) { // fill before mStart
      mSegment.add(0);
      mSegment.add(noun);
    }
    mSegment.add(1);
    mSegment.add(mStart);

    // first b-file entry
    mK = offset;
    mK2 = mK; // copy of k, running as if it were rule A
    if (mMethod.matches("[ABIJKP]")) {
      if ((mRow & 1) != 0) {
        emit(mStart, -1);
      }
    } else if (mMethod.matches("[D]")) {
      // store(mStart); why ??
    } else if (mMethod.matches("[N]")) {
      mSeqLen.add(0);
    } else if (mMethod.matches("[S]")) {
    } else if (mMethod.matches("[T]")) {
      if (mParm == 240508) {
        store(1);
      }
    }
    mFirstApp.add(mStart);
    mSegNo++;
  }

  private void advance() { // count between 0 && nmax, && store in mCounts[4095]
    int attr;
    int noun;
    int amax = -1; // nmax is the current segment length / 2
    // compute length of current segment
    mSeqLen.add(0); // number of elements in segment
    for (int iseg = mFirst; iseg < mSegment.size(); iseg += 2) { // increment for valid entries
      attr = mSegment.get(iseg);
      if (attr != 0 || (mWith0 & 1) != 0) {
        if (mSegNo >= mSeqLen.size()) {
          mSeqLen.add(1);
        } else {
          mSeqLen.set(mSegNo, mSeqLen.get(mSegNo) + 1);
        }
      }
    }
    if (sDebug >= 1) {
      System.out.print("seg# " + mSegNo + ":");
      for (int iseg = mFirst; iseg < mSegment.size(); iseg += 2) { // print the elements of this segment
        attr = mSegment.get(iseg);
        noun = mSegment.get(iseg + 1);
        System.out.print(" " + attr + "." + noun);
      }
      // System.out.print("   mSeqLen=mSeqLen[mSegNo]\n");
      // System.out.println("m1stApp:  . join(, m1stApp[4095]) .");
    }
    // now the b-file entries
    if (mMethod.matches("[ABIJKP]")) { // first || second row || both
      if (mAppear == 1) { // order of first appearance
        for (final int integer : mFirstApp) {
          final int iseg = integer << 1;
          attr = mSegment.get(iseg);
          noun = mSegment.get(iseg + 1);
          if (attr != 0 || (mWith0 & 1) != 0) {
            emit(attr, noun);
          }
        }
      } else if (mAppear == 2) { // decreasing order
        for (int iseg = mSegment.size() - 2; iseg >= mFirst; iseg -= 2) {
          attr = mSegment.get(iseg);
          noun = mSegment.get(iseg + 1);
          if (attr != 0 || (mWith0 & 1) != 0) {
            emit(attr, noun);
          }
        }
      } else if (mAppear == 3) { // increasing order
        for (int iseg = mFirst; iseg < mSegment.size(); iseg += 2) {
          attr = mSegment.get(iseg);
          noun = mSegment.get(iseg + 1);
          if (attr != 0 || (mWith0 & 1) != 0) {
            emit(attr, noun);
          }
        }
      } else {
        System.err.println("invalid parameter op=\"" + mAppear + "\"");
      }
    } else if (mMethod.matches("[D]")) { // new terms (for mAppear.equals("fa")
      for (int iapp = mSeqLen.get(mSegNo - 1); iapp < mSeqLen.get(mSegNo); iapp++) {
        final int iseg = mFirstApp.get(iapp) << 1;
        attr = mSegment.get(iseg);
        noun = mSegment.get(iseg + 1);
        if (attr != 0 || (mWith0 & 1) != 0) {
          emit(attr, noun);
        }
      }
    } else if (mMethod.matches("[N]")) { // no. of new terms in segment
      emit(mSeqLen.get(mSegNo) - mSeqLen.get(mSegNo - 1), -1);
    } else if (mMethod.matches("[T]")) { // no. of terms in segment
      emit(mSeqLen.get(mSegNo), -1);
    }
    noun = 0; // to avoid "not initialized" compiler message
    // compute following segment
    for (int iseg = mFirst; iseg < mSegment.size(); iseg += 2) { // copy attr && determine maximum attr
      attr = mSegment.get(iseg);
      noun = mSegment.get(iseg + 1);
      if (noun >= mCount.size()) { // copy old attr
        mCount.add(attr);
      } else {
        mCount.set(noun, attr);
      }
      if (attr > amax) {
        amax = attr;
      }
    }
    final int lastNoun = noun;
    noun = lastNoun + 1;
    while (noun <= amax) { // insert nouns with 0 attributes
      if (noun >= mCount.size()) { // copy old attr
        mCount.add(0);
      } else {
        mCount.set(noun, 0);
      }
      noun++;
    }
    final int ffCount = noun;
    // now add all (or row1, row2) to mCount[]
    if (mAppear == 1) {
      for (int iapp = 0; iapp < mSeqLen.get(mSegNo); iapp++) {
        assemble(mFirstApp.get(iapp) << 1);
      }
    } else { // "io", "do"
      for (int iseg = mFirst; iseg < mSegment.size(); iseg += 2) { // add
        assemble(iseg);
      } // for iseg
    }
    // copy it back to the segment
    int iseg = 0;
    for (noun = 0; noun < ffCount; noun++) { // add
      if (iseg >= mSegment.size()) {
        mSegment.add(mCount.get(noun));
        mSegment.add(noun);
      } else {
        mSegment.set(iseg, mCount.get(noun));
        mSegment.set(iseg + 1, noun);
      }
      iseg += 2;
    }
  }

  private void assemble(final int iseg) {
    final int attr = mSegment.get(iseg);
    final int noun = mSegment.get(iseg + 1);
    if ((attr != 0 || (mWith0 & 1) != 0) && (mRow != 6)) {
      if (mCount.get(attr) == null || mCount.get(attr) == 0) { // appears for the first time
        mFirstApp.add(attr);
      }
      mCount.set(attr, mCount.get(attr) + 1);
    }
    if ((attr != 0 || (mWith0 & 1) != 0) && (noun != 0 || (mWith0 & 2) != 0) && (mRow != 5)) {
      mCount.set(noun, mCount.get(noun) + 1);
    }
    if (attr == 0 && mParm == 79668) {
      mFirst = 0;
    }
  }

  private void emit(final int attr, final int noun) {
    if (mMethod.matches("P")) {
      if (attr == mParm) {
        store(mK2);
      }
      mK2++;
    } else if (mMethod.matches("I")) {
      System.err.print("cannot process method I");
    } else if (mMethod.matches("J")) {
      if (attr > mCurMax) {
        store(attr);
        mCurMax = attr;
      }
      mK2++;
    } else if (mMethod.matches("K")) {
      if (attr > mCurMax) {
        store(mK2);
        mCurMax = attr;
      }
      mK2++;
    } else if (noun < 0) {
      store(attr);
    } else if (mMethod.matches("N")) {
      store(attr);
    } else if (mMethod.matches("T")) {
      store(attr);
    } else if (mMethod.matches("[AD]")) { // attribute before noun
      if ((mRow & 1) != 0) {
        store(attr);
      }
      if ((mRow & 2) != 0) {
        store(noun);
      }
    } else if (mMethod.matches("[BD]")) { // noun before attribute
      if ((mRow & 1) != 0) {
        store(noun);
      }
      if ((mRow & 2) != 0) {
        store(attr);
      }
    }
  }

  private void store(final int val) {
    mResult.add(val);
    ++mK;
  }

  @Override
  public Z next() {
    while (mResIx >= mResult.size()) {
      advance();
      ++mSegNo;
    }
    return Z.valueOf(mResult.get(mResIx++));
  }

  /**
   *  Test method
   *  @param args command line arguments
   */
  public static void main(final String[] args) {
    int appear = 2;
    sDebug = 0;
    int first = 0;
    int noTerms = 256;
    String method = "A";
    int noeis = 55187;
    int offset = 1;
    int parm = 0;
    int row = 3; // count in both rows,    output both; default
    int start = 1;
    int with0 = 0;
    int iarg = 0;
    while (iarg < args.length) {
      final String opt = args[iarg++];
      try {
        switch (opt) {
          case "-a":
            final String appears = args[iarg++];
            if ("fa".equals(appears)) {
              appear = 1;
            } else if ("do".equals(appears)) {
              appear = 2;
            } else if ("io".equals(appears)) {
              appear = 3;
            } else {
              appear = Integer.parseInt(appears); // keep numeric appear
            }
            break;
          case "-d":
            sDebug = Integer.parseInt(args[iarg++]);
            break;
          case "-f":
            first = Integer.parseInt(args[iarg++]);
            break;
          case "-l":
            noTerms = Integer.parseInt(args[iarg++]);
            break;
          case "-m":
            method = args[iarg++];
            break;
          case "-n":
            noeis = Integer.parseInt(args[iarg++]);
            break;
          case "-o":
            offset = Integer.parseInt(args[iarg++]);
            break;
          case "-p":
            parm = Integer.parseInt(args[iarg++]);
            break;
          case "-r":
            row = Integer.parseInt(args[iarg++]);
            break;
          case "-s":
            start = Integer.parseInt(args[iarg++]);
            break;
          case "-w":
            with0 = Integer.parseInt(args[iarg++]);
            break;
          default:
            System.out.println("invalid option \"" + opt + "\"");
            break;
        }
      } catch (final RuntimeException exc) {
        // ignored
      }
    }
    final Sequence seq = new A055187(offset, method, start, appear, row, first, with0, parm);
    for (int n = offset; n <= noTerms; n++) {
      System.out.println("n " + seq.next());
    }
  }
}
