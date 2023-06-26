package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018442 Divisors of 416.
 * @author Sean A. Irvine
 */
public class A018442 extends FiniteSequence {

  /** Construct the sequence. */
  public A018442() {
    super(1, FINITE, Jaguar.factor(416).divisorsSorted());
  }
}
