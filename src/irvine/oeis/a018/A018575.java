package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018575 Divisors of 656.
 * @author Sean A. Irvine
 */
public class A018575 extends FiniteSequence {

  /** Construct the sequence. */
  public A018575() {
    super(1, FINITE, Jaguar.factor(656).divisorsSorted());
  }
}
