package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018724 Divisors of 925.
 * @author Sean A. Irvine
 */
public class A018724 extends FiniteSequence {

  /** Construct the sequence. */
  public A018724() {
    super(1, FINITE, Jaguar.factor(925).divisorsSorted());
  }
}
