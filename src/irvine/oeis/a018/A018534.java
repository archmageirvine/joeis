package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018534 Divisors of 588.
 * @author Sean A. Irvine
 */
public class A018534 extends FiniteSequence {

  /** Construct the sequence. */
  public A018534() {
    super(1, FINITE, Jaguar.factor(588).divisorsSorted());
  }
}
