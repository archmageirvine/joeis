package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018625 Divisors of 748.
 * @author Sean A. Irvine
 */
public class A018625 extends FiniteSequence {

  /** Construct the sequence. */
  public A018625() {
    super(1, FINITE, Jaguar.factor(748).divisorsSorted());
  }
}
