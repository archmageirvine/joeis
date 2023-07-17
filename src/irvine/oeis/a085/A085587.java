package irvine.oeis.a085;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A085587 Eventual period of a single cell in rule 90 cellular automaton in a cyclic universe of width n.
 * @author Sean A. Irvine
 */
public class A085587 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A085587(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A085587() {
    super(1);
  }

  protected int mN = 0;

  protected Z step(final Z state) {
    final Z a = state.divide2().or(state.and(Z.ONE).shiftLeft(mN - 1));
    final Z b = state.clearBit(mN - 1).multiply2().add(state.testBit(mN - 1) ? 1 : 0);
    return a.xor(b);
  }

  private long getPeriod() {
    // Find a starting state somewhere on a cycle
    Z state = Z.ONE;
    Z kangaroo = step(state);
    while (!kangaroo.equals(state)) {
      state = step(state);
      kangaroo = step(step(kangaroo));
    }
    // Count the length of the cycle
    long period = 0;
    do {
      kangaroo = step(kangaroo);
      ++period;
    } while (!kangaroo.equals(state));
    return period;
  }

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(getPeriod());
  }

}
