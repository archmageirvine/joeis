package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018684 Divisors of 854.
 * @author Sean A. Irvine
 */
public class A018684 extends FiniteSequence {

  /** Construct the sequence. */
  public A018684() {
    super(1, FINITE, Jaguar.factor(854).divisorsSorted());
  }
}
