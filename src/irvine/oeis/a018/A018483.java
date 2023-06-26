package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018483 Divisors of 490.
 * @author Sean A. Irvine
 */
public class A018483 extends FiniteSequence {

  /** Construct the sequence. */
  public A018483() {
    super(1, FINITE, Jaguar.factor(490).divisorsSorted());
  }
}
