package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018469 Divisors of 464.
 * @author Sean A. Irvine
 */
public class A018469 extends FiniteSequence {

  /** Construct the sequence. */
  public A018469() {
    super(1, FINITE, Jaguar.factor(464).divisorsSorted());
  }
}
