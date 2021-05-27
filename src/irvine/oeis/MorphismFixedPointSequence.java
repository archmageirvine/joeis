package irvine.oeis;

import irvine.math.z.Z;

/**
 * Second, alternate attempt, first version was MorphismSequence.
 * Scan a word from left to right, replace the possible patterns, repeat and
 * assume that the beginning of the word becomes steady.
 * An example is:
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
public class MorphismFixedPointSequence implements Sequence {

  private static final int POS_FRACTION = 4; 
  private static final int MAX_LEN = 1000000; // maximum length of a word
  protected String mStart; // the starting word
  protected String mAnchor; // start of the desired limiting word, or triangle of words if empty
  protected boolean mIsAnchored; // whether mAnchor is empty
  protected int mFactor; // each iterate increases the length roughly by this factor

  protected String mCurWord; // current word expanded so far
  protected String[] mMap; // pairs of String->String, flattened
  protected int mPos; // current position in mCurWord
  protected int mMaxPos; // assume that digits are safe up to this position
  protected static int mDebug = 0; // 0 = none, 1 = some, 2 = more debugging output

  /**
   * Empty constructor, used for special variants.
   */
  protected MorphismFixedPointSequence() {
  } // Constructor

  /**
   * Construct an instance which generates the fixed point of this morphism.
   * @param anchor start of the desired limiting word, or triangle of words if empty
   * @param start start with this word
   * @param mappings pairs of digit string mappings, for example "0-&gt;001,1-&gt;0"
   */
  protected MorphismFixedPointSequence(final String start, final String anchor, final String mappings) {
    configure(start, anchor, mappings);
    if (mIsAnchored) {
      while (mCurWord.length() < 1024 || !mCurWord.startsWith(mAnchor)) { // expand a few times
        expandWord();
      } // while iexp
    }
  } // Constructor

  /**
   * Construct an instance which generates the fixed point of this morphism.
   * @param anchor start of the desired limiting word, or triangle of words if empty
   * @param start start with this word
   * @param mappings pairs of digit string mappings, for example "0-&gt;001,1-&gt;0"
   */
  protected void configure(final String start, final String anchor, final String mappings) {
    mFactor = 2;
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
    } // for pair1
    mStart = start;
    mCurWord = mStart;
    mAnchor = anchor;
    mIsAnchored = mAnchor.length() > 0;
    mPos = 0;
  } // configure
  
  /**
   * Get the next term of the sequence.
   * @return the next term
   */
  @Override
  public Z next() {
    if (mIsAnchored) {
      while (mPos >= mMaxPos) {
        expandWord();
        while (!mCurWord.startsWith(mAnchor)) { // make sure that it starts with the anchor
          expandWord();
        } // while expanding
      }
    } else { // unanchored = triangle, expand all iterates in full length
      if (mPos >= mCurWord.length()) {
        expandWord();
        mPos = 0;
      }
    }
    // take next from current word
    final char ch = mCurWord.charAt(mPos++);
    return ch == 'M' ? Z.NEG_ONE : Z.valueOf(ch - '0');
  } // next

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
    mMaxPos = mCurWord.length() * (POS_FRACTION - 3) / POS_FRACTION;

    if (mDebug > 0) {
      final int len = mCurWord.length();
      System.out.println("# expandWord: anchor=" + mAnchor
        + " pos=" + String.format("%6d", mPos)
        + " max=" + String.format("%8d", mMaxPos)
        + " " + (len < 96 ? mCurWord : mCurWord.substring(0, 96) + " ...")
        );
    }

    if (mCurWord.length() > MAX_LEN) {
      throw new IllegalArgumentException("mCurWord longer than " + MAX_LEN + " characters");
    }
  } // expandWord

  /**
   * Test method
   * @param args command line arguments: 
   * <ul>
   * <li>-i initial word, start, default "0"</li>
   * <li>-a anchor, default "0010"</li>
   * <li>-m mappings, default "0->001,1->0"</li>
   * <li>-n number of terms, default 32</li>
   * <li>-o offset, default 1</li>
   * <li>-d debugging mode: 0=none (default), 1=some, 2=more</li>
   * </ul>
   */
  public static void main(final String[] args) {
    int noTerms = 32;
    int offset = 1;
    int debug = 0;
    String start = "0";
    String anchor = "0010";
    String mappings = "0->001,1->0"; // A171588
    int iarg = 0;
    while (iarg < args.length) {
      final String opt = args[iarg++];
      try {
        if (false) {
        } else if (opt.equals("-d")) {
          debug = Integer.parseInt(args[iarg++]);
        } else if (opt.equals("-i")) {
          start = args[iarg++];
        } else if (opt.equals("-a")) {
          anchor = args[iarg++];
        } else if (opt.equals("-m")) {
          mappings = args[iarg++];
        } else if (opt.equals("-n")) {
          noTerms = Integer.parseInt(args[iarg++]);
        } else if (opt.equals("-n")) {
          offset = Integer.parseInt(args[iarg++]);
        } else {
          System.err.println("invalid option " + opt);
        }
      } catch (final NumberFormatException exc) {
        // ignored
      }
    }
    System.out.println("start=" + start + ", anchor=" + anchor + ", mappings=" + mappings + ", nt=" + noTerms + ", debug=" + debug);
    MorphismFixedPointSequence.mDebug = debug;
    MorphismFixedPointSequence seq = new MorphismFixedPointSequence(start, anchor, mappings);
    int index = offset;
    while (index < noTerms) {
      System.out.println(index + " " + seq.next());
      ++index;
    }
  } // main
} 
