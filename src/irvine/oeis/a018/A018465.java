package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018465 Divisors of 456.
 * @author Sean A. Irvine
 */
public class A018465 extends FiniteSequence {

  /** Construct the sequence. */
  public A018465() {
    super(1, FINITE, Jaguar.factor(456).divisorsSorted());
  }
}
