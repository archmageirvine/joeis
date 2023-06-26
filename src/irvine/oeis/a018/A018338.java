package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018338 Divisors of 216.
 * @author Sean A. Irvine
 */
public class A018338 extends FiniteSequence {

  /** Construct the sequence. */
  public A018338() {
    super(1, FINITE, Jaguar.factor(216).divisorsSorted());
  }
}
