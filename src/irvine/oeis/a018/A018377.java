package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018377 Divisors of 290.
 * @author Sean A. Irvine
 */
public class A018377 extends FiniteSequence {

  /** Construct the sequence. */
  public A018377() {
    super(1, FINITE, Jaguar.factor(290).divisorsSorted());
  }
}
