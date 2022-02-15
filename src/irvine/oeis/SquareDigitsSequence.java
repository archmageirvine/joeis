package irvine.oeis;

import irvine.math.z.Z;

/**
 * Numbers <code>k</code> that contain only a subset of (decimal) digits in its square <code>k^2</code>
 * and optionally in <code>k</code> itself.
 * Triangular numbers instead of squares can be tested also by this class.
 * For some subsets of the digits there are only rare or no solutions.
 *
 * The algorithm processes a block of possible numbers of length <em>width</em>.
 * Any digit from the subset is prefixed to each member of the block,
 * and then the squares (and the numbers) are checked.
 * The numbers in the block are requeued if and only if the square mod 10^width has allowable digits only.
 * There is an additional option that forbids trailing '0' digits in the number.
 * Complications arise when the digits subset contains '0' and by the omission of leading zeroes.
 * @author Georg Fischer
 */
public class SquareDigitsSequence implements Sequence {

  protected static int sDebug = 0;
  protected String mSubset; // the decimal digits of the subset in ascending order
  private int mDig; // current digit to be prefixed
  private final int mFirstDig; // lowest valid digit, or 0
  protected int mBase; // base of the numbers: 2-99
  protected Z mBaseZ; // base as Z
  //protected int mMask; // bitmask for the variants
  //protected Pattern mAllowPattern; // pattern matching the subset of not-allowed decimal digits
  protected boolean[] mAllowedDigits; // true if a digit = index is allowed
  private Z[] mOldBlock; // array of numbers k that were under concern
  private Z[] mNewBlock; // array of numbers k now under concern
  private int mOldIx; // index in mOldBlock
  private int mNewIx; // index in mNewBlock
  private int mOldLen; // length of occupied elements in mOldBlock
  private Z mAdd; // put this digit in from of k
  private Z mAdd1; // unit for mAdd
  private Z mMod; // gives the width of the superdigit that always has a valid superdigit at the end of its square
  private Z mOldK; // previous value of k
  protected int mN; // current OEIS index
  private final boolean mTestK; // whether k should have valid digits also
  private final boolean mNextK2; // whether k^2 should be emitted isntead of k
  private final boolean mNoZeroTail; // whether a valid k may not have a trailing zero
  private final boolean mTriangular; // whether to investigate triangular numbers instead of squares
  private Z mBasePower; // for ZUtils.basePower()
  private int mLogU; // for ZUtils.basePower()

  /**
   * Construct an instance for some variant.
   * @param offset first valid term has this index
   * @param base base of the numbers: 2-99
   * @param mask bit mask for variants of the tests to be applied to the digits:
   * <ul>
   * <li>1 = emit <code>k^2</code> instead of <code>k</code></li>
   * <li>2 = <code>k</code> and <code>k^2</code> must consists of the digits</li>
   * <li>4 = only <code>k^2</code> must consists of the digits</li>
   * <li>8 = the last digit of <code>k</code> may not be 0</li>
   * <li>16 = investigate triangular numbers instead of squares</li>
   * </ul>
   * @param subset String of decimal digits in ascending order, representing the desired subset
   */
  protected SquareDigitsSequence(final int offset, final int base, final int mask, final String subset) {
    mBase = base;
    mBaseZ = Z.valueOf(mBase);
    //mMask = mask;
    mTestK = (mask & 2) != 0;
    mNextK2 = (mask & 1) != 0;
    mNoZeroTail = (mask & 8) != 0;
    mTriangular = (mask & 16) != 0;
    mSubset = subset.replaceAll("\\D", "");
    //mAllowPattern = Pattern.compile("[" + mSubset + "]*");
    mAllowedDigits = new boolean[mBase]; // initialized with false
    for (int isub = 0; isub < mSubset.length(); ++isub) {
      mAllowedDigits[Character.digit(mSubset.charAt(isub), mBase)] = true;
    }
    mFirstDig = Character.digit(mSubset.charAt(0), mBase);
    mOldBlock = new Z[] {Z.ZERO};
    mOldIx = 0;
    mOldLen = mOldBlock.length;
    mNewBlock = new Z[mOldLen * mBase];
    mNewIx = 0;
    mAdd1 = Z.ONE;
    mAdd = Z.ZERO;
    mMod = Z.valueOf(mBase);
    mOldK = Z.ZERO;
    mDig = 0;
    mN = mTriangular ? offset - 1 : 0;
    // from ZUtils.basePower():
    mLogU = 0;
    Z t = Z.valueOf(mBase);
    mBasePower = Z.ONE;
    while (t.bitLength() < Long.SIZE) {
      mBasePower = t;
      t = t.multiply(mBase);
      ++mLogU;
    }
  }

  /**
   * Test whether a number has allowable digits only.
   * Faster version, adapted from <code>ZUtils.digitCounts()</code>.
   * @param n number to be tested
   * @return -1 if all digits are allowed, or exponent of <code>mBase</code> of first non-matching digit
   */
  public int badDigitPosition(final Z n) {
    if (n.isZero()) {
      return mFirstDig == 0 ? -1 : 0;
    } else {
      Z m = n;
      int pos = 0;
      long v;
      while (m.compareTo(mBasePower) >= 0) {
        final Z[] qr = m.divideAndRemainder(mBasePower);
        v = qr[1].longValue();
        for (int k = 0; k < mLogU; ++k) {
          if (!mAllowedDigits[(int) (v % mBase)]) {
            return pos;
          }
          v /= mBase;
          ++pos;
        }
        m = qr[0];
      }
      v = m.longValue();
      while (v != 0) {
        if (!mAllowedDigits[(int) (v % mBase)]) {
          return pos;
        }
        v /= mBase;
        ++pos;
      }
    }
    return -1;
  }

  /**
   * Get the next term of the sequence.
   * @return the next term
   */
  @Override
  public Z next() {
    if (mTriangular) {
      while (true) {
        ++mN;
        final Z result = Z.valueOf(mN + 1).multiply(mN).divide2();
        if (badDigitPosition(result) < 0) {
          return mNextK2 ? result : Z.valueOf(mN);
        }
      }
    } else {
      if (mN == 0) {
        if (!mNoZeroTail && badDigitPosition(Z.ZERO) < 0) {
          ++mN;
          return Z.ZERO;
        }
      }
      while (true) {
        while (mDig < mBase) {
          if (!mTestK || mAllowedDigits[mDig]) {
            final Z mod1 = mMod.multiply(mFirstDig);
            while (mOldIx < mOldLen) {
              final Z k = mAdd.add(mOldBlock[mOldIx++]); // pop
              final Z k2 = k.multiply(k);
              final Z[] quot = k2.divideAndRemainder(mMod);
              final Z remainder = mFirstDig == 0 ? quot[1] : quot[1].add(mod1);
              if (badDigitPosition(remainder) < 0) {
                mNewBlock[mNewIx++] = k; // push
                if ((quot[0].isZero() || badDigitPosition(quot[0]) < 0)
                  && (!mTestK || badDigitPosition(k) < 0)
                  && (!mNoZeroTail || k.mod(mBase) != 0)
                  && mOldK.compareTo(k) < 0
                ) {
                  mOldK = k;
                  ++mN;
                  return mNextK2 ? k2 : k;
                }
              }
            }
          }
          mOldIx = 0;
          mAdd = mAdd.add(mAdd1);
          ++mDig;
        }
        mDig = 0;
        mOldLen = mNewIx;
        mOldBlock = mNewBlock;
        mNewBlock = new Z[mOldLen * mBase];
        mNewIx = 0;
        mAdd1 = mAdd1.multiply(mBaseZ);
        mMod = mMod.multiply(mBaseZ);
        mAdd = Z.ZERO;
      }
    }
  }

  /*
   *  Test method
   *  @param args command line arguments: [noterms [digits]]
   *  Show various elements related to the runs of digits for some base in n.
   */
/*
  public static void main(String[] args) {
    String subset = "23467"; // A137071
    int noTerms   = 8;
    int mask = 2;
    int iarg = 0;
    while (iarg < args.length) { // consume all arguments
      final String opt = args[iarg ++];
      try {
        if (false) {
        } else if (opt.equals    ("-d")     ) {
          SquareDigitsSequence.sDebug = Integer.parseInt(args[iarg++]);
        } else if (opt.equals    ("-m")     ) {
          mask    = Integer.parseInt(args[iarg++]);
        } else if (opt.equals    ("-n")     ) {
          noTerms = Integer.parseInt(args[iarg++]);
        } else if (opt.equals    ("-s")     ) {
          subset  = args[iarg++];
        } else {
          System.err.println("??? invalid option: \"" + opt + "\"");
        }
      } catch (Exception exc) { // take default
      }
    }
    
    SquareDigitsSequence seq = new SquareDigitsSequence(1, 10, mask, subset);
    int index = 1;
    while (index < noTerms) {
      System.out.println(index + " " + seq.next().toString());
      ++index;
    }
  }
*/
}
