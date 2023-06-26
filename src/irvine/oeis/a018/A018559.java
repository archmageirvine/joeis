package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018559 Divisors of 630.
 * @author Sean A. Irvine
 */
public class A018559 extends FiniteSequence {

  /** Construct the sequence. */
  public A018559() {
    super(1, FINITE, Jaguar.factor(630).divisorsSorted());
  }
}
