package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018486 Divisors of 495.
 * @author Sean A. Irvine
 */
public class A018486 extends FiniteSequence {

  /** Construct the sequence. */
  public A018486() {
    super(1, FINITE, Jaguar.factor(495).divisorsSorted());
  }
}
