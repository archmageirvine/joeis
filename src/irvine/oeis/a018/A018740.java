package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018740 Divisors of 952.
 * @author Sean A. Irvine
 */
public class A018740 extends FiniteSequence {

  /** Construct the sequence. */
  public A018740() {
    super(1, FINITE, Jaguar.factor(952).divisorsSorted());
  }
}
