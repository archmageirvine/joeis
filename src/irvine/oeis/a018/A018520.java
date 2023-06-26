package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018520 Divisors of 561.
 * @author Sean A. Irvine
 */
public class A018520 extends FiniteSequence {

  /** Construct the sequence. */
  public A018520() {
    super(1, FINITE, Jaguar.factor(561).divisorsSorted());
  }
}
