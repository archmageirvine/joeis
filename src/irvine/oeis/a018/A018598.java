package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018598 Divisors of 700.
 * @author Sean A. Irvine
 */
public class A018598 extends FiniteSequence {

  /** Construct the sequence. */
  public A018598() {
    super(1, FINITE, Jaguar.factor(700).divisorsSorted());
  }
}
