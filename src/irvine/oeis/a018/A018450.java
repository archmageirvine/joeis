package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018450 Divisors of 429.
 * @author Sean A. Irvine
 */
public class A018450 extends FiniteSequence {

  /** Construct the sequence. */
  public A018450() {
    super(1, FINITE, Jaguar.factor(429).divisorsSorted());
  }
}
