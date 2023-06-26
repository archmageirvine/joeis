package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018354 Divisors of 246.
 * @author Sean A. Irvine
 */
public class A018354 extends FiniteSequence {

  /** Construct the sequence. */
  public A018354() {
    super(1, FINITE, Jaguar.factor(246).divisorsSorted());
  }
}
