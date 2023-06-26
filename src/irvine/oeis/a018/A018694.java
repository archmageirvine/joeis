package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018694 Divisors of 872.
 * @author Sean A. Irvine
 */
public class A018694 extends FiniteSequence {

  /** Construct the sequence. */
  public A018694() {
    super(1, FINITE, Jaguar.factor(872).divisorsSorted());
  }
}
