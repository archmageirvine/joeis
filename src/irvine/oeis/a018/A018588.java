package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018588 Divisors of 678.
 * @author Sean A. Irvine
 */
public class A018588 extends FiniteSequence {

  /** Construct the sequence. */
  public A018588() {
    super(1, FINITE, Jaguar.factor(678).divisorsSorted());
  }
}
