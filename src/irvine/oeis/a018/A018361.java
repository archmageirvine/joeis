package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018361 Divisors of 261.
 * @author Sean A. Irvine
 */
public class A018361 extends FiniteSequence {

  /** Construct the sequence. */
  public A018361() {
    super(1, FINITE, Jaguar.factor(261).divisorsSorted());
  }
}
