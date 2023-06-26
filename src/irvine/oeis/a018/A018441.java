package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018441 Divisors of 414.
 * @author Sean A. Irvine
 */
public class A018441 extends FiniteSequence {

  /** Construct the sequence. */
  public A018441() {
    super(1, FINITE, Jaguar.factor(414).divisorsSorted());
  }
}
