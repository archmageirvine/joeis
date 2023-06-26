package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018487 Divisors of 496.
 * @author Sean A. Irvine
 */
public class A018487 extends FiniteSequence {

  /** Construct the sequence. */
  public A018487() {
    super(1, FINITE, Jaguar.factor(496).divisorsSorted());
  }
}
