package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018407 Divisors of 351.
 * @author Sean A. Irvine
 */
public class A018407 extends FiniteSequence {

  /** Construct the sequence. */
  public A018407() {
    super(1, FINITE, Jaguar.factor(351).divisorsSorted());
  }
}
