package irvine.oeis;

import irvine.math.z.Z;

/**
 * Computes Stephen Wolfram's one-dimensional automata.
 * @author Pablo Mayrgundter
 * @author Sean A. Irvine
 */
public class WolframAutomata implements Sequence {

  private final boolean[] mRule;
  private Z mCur;
  private long mRow = -1;
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
    return k < 0 || k >= mLength ? mRow > 1 && mRule[0] : set.testBit(k);
  }

  @Override
  public Z next() {
    if (++mRow == 0) {
      return mCur;
    }
    Z next = Z.ZERO;
    for (int k = 0; k < mLength + 2; ++k) {
      // get left, centre, right pixels
      final int l = isSet(mCur, k - 2) ? 4 : 0;
      final int c = isSet(mCur, k - 1) ? 2 : 0;
      final int r = isSet(mCur, k) ? 1 : 0;
      if (mRule[l | c | r]) {
        next = next.setBit(k);
      }
    }
    mLength += 2;
    ++mRow;
    mCur = next;
    return mCur;
  }

  /**
   * Convenience method to return the next state of an automata.
   * @param rule rule number of automata
   * @param state starting state
   * @return next state
   */
  public static Z step(final int rule, final Z state) {
    final WolframAutomata a = new WolframAutomata(rule, state);
    a.next(); // skip the input state
    return a.next();
  }
}
