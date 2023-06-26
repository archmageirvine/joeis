package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018399 Divisors of 336.
 * @author Sean A. Irvine
 */
public class A018399 extends FiniteSequence {

  /** Construct the sequence. */
  public A018399() {
    super(1, FINITE, Jaguar.factor(336).divisorsSorted());
  }
}
