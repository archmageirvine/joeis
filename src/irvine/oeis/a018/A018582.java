package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018582 Divisors of 666.
 * @author Sean A. Irvine
 */
public class A018582 extends FiniteSequence {

  /** Construct the sequence. */
  public A018582() {
    super(1, FINITE, Jaguar.factor(666).divisorsSorted());
  }
}
