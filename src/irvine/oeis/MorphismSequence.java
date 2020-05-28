package irvine.oeis;

import irvine.math.z.Z;

/**
 * A typical example for these sequences is:
 * <pre>
 * A171588 The Pell word: Fixed point of the morphism 0-&gt;001, 1-&gt;0.
 * S(0) = 0
 * S(1) = 001
 * S(2) = 001 001 0
 * S(3) = 0010010 0010010 001
 * S(4) = 00100100010010001 00100100010010001 0010010.
 * </pre>
 * @author Georg Fischer
 */
public class MorphismSequence implements Sequence {

  private static final int POS_FRACTION = 3; // 1 / (how much of mCurWord is reliable)
  //protected int mN; // index of current term to be returned
  //protected Z mK; // current number with some property
  //protected int mOffset; // OEIS offset1 as of generation time
  protected String mStart; // the starting word
  protected String mLimit; // start of the desired limiting word
  protected int mFactor; // each iterate increases the length roughly by this factor

  private String mCurWord; // current word expanded so far
  private String[] mMap; // pairs of String->String, flattened
  private int mPos; // current position in mCurWord
  private int mMaxPos; // assume that digits are safe up to this position
  protected int mDebug = 0; // 0 = none, 1 = some, 2 = more debugging output

  /**
   * Empty constructor.
   */
  protected MorphismSequence() {
    //mOffset = 0;
  } // Constructor

  /**
   * Construct an instance which generates the fixed point of this morphism.
   * @param offset first valid term has this index
   * @param limit start of the desired limiting word (ignored)
   * @param start start with this word
   * @param mappings pairs of digit string mappings, for example "0-&gt;001,1-&gt;0"
   */
  protected MorphismSequence(final int offset, final String start, final String limit, final String mappings) {
    //mOffset = offset;
    initialize(start, limit, mappings);
  } // Constructor

  /**
   * Construct an instance which generates the fixed point of this morphism.
   * @param limit start of the desired limiting word (ignored)
   * @param start start with this word
   * @param mappings pairs of digit string mappings, for example "0-&gt;001,1-&gt;0"
   */
  protected void initialize(final String start, final String limit, final String mappings) {
    mFactor = 2;
    //mN = 0;
    //mK = Z.ZERO;
    final String[] pairs = mappings.replaceAll(" ", "").split("\\,"); // remove spaces inserted by gen_seq4.pl
    mMap = new String[pairs.length * 2];
    int imap = 0;
    for (final String pair1 : pairs) {
      String[] pair = pair1.split("\\-\\>");
      if (pair.length == 1) {
        pair = new String[]{pair[0], ""};
      } else if (pair1.startsWith("->")) {
        pair = new String[]{"", pair[0]};
      }
      mMap[imap++] = pair[0];
      mMap[imap++] = pair[1];
    } // for ipair
    if (start.length() >= 1 && mMap[0].length() <= start.length()) {
      mStart = start;
    } else {
      mStart = mMap[0];
    }
    mCurWord = mStart;
    final String[] iterates = new String[5];
    int iexp = 0;
    while (iexp < iterates.length - 1) { // expand a few times
      iterates[iexp] = mCurWord;
      expandWord();
      ++iexp;
    } // while iexp
    iterates[iexp] = mCurWord;
    final String oldWord = iterates[iexp - 1];
    mLimit = mCurWord.substring(0, 2);
    if (!mLimit.equals(oldWord.substring(0, 2))) {
      mLimit = mStart;
      //oldWord = mStart; // = iterates[0];
    }
    mPos = 0;
    mMaxPos = mCurWord.length() / POS_FRACTION;
  } // initialize

  /**
   * Expand the current word by applying the mapping rules from left to right.
   */
  public void expandWord() {
    final StringBuilder newWord = new StringBuilder(mPos * mFactor);
    int ipos = 0;
    while (ipos < mCurWord.length()) {
      int imap = 0;
      boolean busy = true;
      while (busy && imap < mMap.length) {
        final String search = mMap[imap++];
        final String replace = mMap[imap++];
        if (mCurWord.startsWith(search, ipos)) {
          newWord.append(replace);
          ipos += search.length();
          busy = false;
        }
      } // while imap
      if (busy) { // no mapping could be applied
        newWord.append(mCurWord.charAt(ipos++)); // copy character unchanged
      }
    } // while ipos
    mCurWord = newWord.toString();
    mMaxPos = mCurWord.length() / POS_FRACTION;
    if (mDebug > 0) {
      final int len = mCurWord.length();
      System.out.println("# limit=" + mLimit
        + " pos=" + String.format("%4d", mPos)
        + " max=" + String.format("%4d", mMaxPos)
        + " " + (len < 96 ? mCurWord : mCurWord.substring(0, 96) + " ..."));
    }
    if (mCurWord.length() > 1000000) {
      throw new IllegalArgumentException("mCurWord longer than 10^6 characters");
    }
  } // expandWord

  /**
   * Get the next term of the sequence.
   * @return the next term
   */
  @Override
  public Z next() {
    if (mPos >= mMaxPos) {
      int iexp = 4;
      while (iexp > 0) { // expand to next possible
        expandWord();
        if (mCurWord.startsWith(mLimit)) {
          iexp = 0;
        }
        iexp--;
      } // while expanding
      // iexp = -1 if some next was possible
      if (iexp == 0 && mDebug > 0) { // not possible
        System.err.println("assertion iexp in MorphismSequence.next, pos = " + mPos
          + ", word = \"" + mCurWord + "\"");
      }
      if (mPos >= mMaxPos && mDebug > 0) {
        System.err.println("assertion maxPos in MorphismSequence.next, maxPos = " + mMaxPos
          + ", word = \"" + mCurWord + "\"");
      }
    }
    // take next from current word
    return Z.valueOf(mCurWord.charAt(mPos++) - '0');
  } // next

  //=====================================

  /**
   * Test method
   * @param args command line arguments: [no-terms [mappings [start]]]
   * Computes the fixed point of a mapping.
   */
  public static void main(final String[] args) {
    int noTerms = 32;
    String mappings = "0->001,1->0"; // A171588
    int iarg = 0;
    if (iarg < args.length) {
      try {
        noTerms = Integer.parseInt(args[iarg++]);
      } catch (final NumberFormatException exc) {
        // ignored
      }
    }
    if (iarg < args.length) {
      mappings = args[iarg++].replaceAll(" ", "");
    }
    String start = mappings.substring(0, mappings.indexOf('-'));
    if (iarg < args.length) {
      start = args[iarg];
    }
    final MorphismSequence seq = new MorphismSequence();
    seq.mDebug = noTerms & 3; /// last 2 bits
    seq.initialize(start, start, mappings);
    int index = 1;
    while (index < noTerms) {
      System.out.println(index + " " + seq.next());
      ++index;
    } // while index
  } // main
} // MorphismSequence
