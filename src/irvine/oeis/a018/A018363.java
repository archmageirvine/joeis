package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018363 Divisors of 266.
 * @author Sean A. Irvine
 */
public class A018363 extends FiniteSequence {

  /** Construct the sequence. */
  public A018363() {
    super(1, FINITE, Jaguar.factor(266).divisorsSorted());
  }
}
