package irvine.math;

import java.util.BitSet;

import irvine.math.z.Z;

/**
 * Computes Stephen Wolfram's automata.
 *
 * @author Pablo Mayrgundter
 * @author Sean A. Irvine
 */
public class WolframAutomata {

  /** The rule. */
  private final boolean[] mRule;
  /** Current state. */
  private BitSet mCur;
  private int mLength;

  /**
   * Construct a new generator for the specified Wolfram automata.
   * The automata is initialized with a single black pixel.
   * @param rule the rule to use
   * @exception IllegalArgumentException if the rule is not valid.
   */
  public WolframAutomata(final int rule) {
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
    mCur = new BitSet(1);
    mCur.set(0, true);
    mLength = 1;
  }

  private boolean isSet(final int k) {
    return k < 0 || k >= mLength ? mLength != 1 && mRule[0] : mCur.get(k);
  }

  /**
   * Perform the cellular automata on the specified bit set.
   * @param set bit set
   * @return next bit set
   */
  public BitSet step(final BitSet set) {
    final BitSet next = new BitSet(mLength + 2);
    for (int k = 0; k < mLength + 2; ++k) {
      // get left, centre, right pixels
      final int l = isSet(k - 2) ? 4 : 0;
      final int c = isSet(k - 1) ? 2 : 0;
      final int r = isSet(k) ? 1 : 0;
      next.set(k, mRule[l | c | r]);
    }
    mLength += 2;
    return set;
  }

  /**
   * Return a bit set with the next step of the automata.
   * @return next step of automata
   */
  public BitSet next() {
    mCur = step(mCur);
    return mCur;
  }

  /**
   * Return a simple string representation of the current iteration.
   * @return a string
   */
  public String toString() {
    final StringBuilder sb = new StringBuilder();
    for (int k = 0; k < mLength; ++k) {
      sb.append(mCur.get(k) ? '1' : '0');
    }
    return sb.toString();
  }

  /**
   * Return the current iteration as a Z.
   * @return a Z.
   */
  public Z toZ() {
    Z result = Z.ZERO;
    for (int k = 0; k < mLength; ++k) {
      result = result.shiftLeft(1);
      if (mCur.get(k)) {
        result = result.add(1);
      }
    }
    return result;
  }
}
