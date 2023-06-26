package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018417 Divisors of 369.
 * @author Sean A. Irvine
 */
public class A018417 extends FiniteSequence {

  /** Construct the sequence. */
  public A018417() {
    super(1, FINITE, Jaguar.factor(369).divisorsSorted());
  }
}
