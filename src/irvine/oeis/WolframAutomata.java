package irvine.oeis;

import irvine.math.z.Z;

/**
 * Computes Stephen Wolfram's one-dimensional automata.
 *
 * @author Pablo Mayrgundter
 * @author Sean A. Irvine
 */
public class WolframAutomata implements Sequence {

  /** The rule. */
  private final boolean[] mRule;
  /** Current state. */
  private Z mCur;
  private boolean mFirst = true;
  private int mLength;

  /**
   * Construct a new generator for the specified Wolfram automata.
   * The automata is initialized with a single black pixel.
   * @param rule the rule to use
   * @param startState initial state
   * @exception IllegalArgumentException if the rule is not valid.
   */
  public WolframAutomata(final int rule, final Z startState) {
    if ((rule & ~0xFF) != 0) {
      throw new IllegalArgumentException("Rule must be 0 <= rule <= 255");
    }
    mRule = new boolean[8];
    mRule[0] = (rule & 1) != 0;
    mRule[1] = (rule & 2) != 0;
    mRule[2] = (rule & 4) != 0;
    mRule[3] = (rule & 8) != 0;
    mRule[4] = (rule & 16) != 0;
    mRule[5] = (rule & 32) != 0;
    mRule[6] = (rule & 64) != 0;
    mRule[7] = (rule & 128) != 0;
    mCur = startState;
    mLength = Math.max(1, startState.bitLength());
  }

  /**
   * Construct a new generator for the specified Wolfram automata.
   * The automata is initialized with a single black pixel.
   * @param rule the rule to use
   * @exception IllegalArgumentException if the rule is not valid.
   */
  public WolframAutomata(final int rule) {
    this(rule, Z.ONE);
  }

  private boolean isSet(final Z set, final int k) {
    //return k >= 0 && set.testBit(k);
    return k < 0 || k >= mLength ? mLength != 1 && mRule[0] : set.testBit(k);
  }

  @Override
  public Z next() {
    if (mFirst) {
      mFirst = false;
      return mCur;
    }
    Z next = Z.ZERO;
    mLength += 2;
    for (int k = 0; k < mLength; ++k) {
      // get left, centre, right pixels
      final int l = isSet(mCur, k - 2) ? 4 : 0;
      final int c = isSet(mCur, k - 1) ? 2 : 0;
      final int r = isSet(mCur, k) ? 1 : 0;
      if (mRule[l | c | r]) {
        next = next.setBit(k);
      }
    }
    mCur = next;
    return mCur;
  }
}
/*
 public BitSet next() {
    final BitSet next = new BitSet(mCur.length() + 2);
    for (int i = -1; i <= mCur.length();) {
      // get left, centre, right pixels
      final int l = i <= 0 ? 0 : (mCur.get(i - 1) ? 4 : 0);
      final int c = i < 0 ? 0 : (mCur.get(i) ? 2 : 0);
      final int r = mCur.get(i + 1) ? 1 : 0;
      next.set(++i, mRule[l | c | r]);
    }
    mCur = next;
    return mCur;
  }

 */
