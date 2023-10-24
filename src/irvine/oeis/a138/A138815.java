package irvine.oeis.a138;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.FiniteSequence;

/**
 * A138815 Divisors of 16775168 (half the 5th perfect number).
 * @author Georg Fischer
 */
public class A138815 extends FiniteSequence {

  /** Construct the sequence. */
  public A138815() {
    this(1, new Z("16775168"));
  }

  /**
   * Generic constructor with parameters
   * @param offset first index
   * @param num number to be factored
   */
  public A138815(final int offset, final Z num) {
    super(offset, FINITE, Jaguar.factor(num).divisorsSorted());
  }
}
