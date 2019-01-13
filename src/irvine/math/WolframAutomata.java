package irvine.math;

import irvine.math.z.Z;

import java.util.BitSet;

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

  /**
   * Construct a new generator for the specified Wolfram automata.
   * The automata is initialized with a single black pixel.
   *
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
  }

  /**
   * Return a bit set with the next step of the automata.
   *
   * @return next step of automata
   */
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

  /**
   * Return a simple string representation of the current iteration.
   *
   * @return a string
   */
  public String toString() {
    final StringBuilder sb = new StringBuilder();
    for (int i = 0; i < mCur.length(); ++i) {
      sb.append(mCur.get(i) ? "1" : "0");
    }
    return sb.toString();
  }

  /**
   * Return the current iteration as a Z.
   *
   * @return a Z.
   */
  public Z toZ() {
    Z result = Z.ZERO;
    for (int i = 0; i < mCur.length(); ++i) {
      result = result.shiftLeft(1);
      if (mCur.get(i)) {
        result = result.add(Z.ONE);
      }
    }
    return result;
  }

  /**
   * Noddy test main.
   *
   * @param args integer values to start at
   */
  public static void main(final String[] args) {
    final int start = Integer.parseInt(args[0]);
    final WolframAutomata wa = new WolframAutomata(30);
    for (int i = 0; i < start; ++i) {
      wa.next();
    }
    for (int i = start; i < start + 10; ++i) {
      //      System.out.println(i + " " + wa.toString() + " " + wa.toZ());
      System.out.println("print \"" + i +  ": \", TrialDivision(" + wa.toZ() + ",20000000);");
      wa.next();
    }
  }
}
