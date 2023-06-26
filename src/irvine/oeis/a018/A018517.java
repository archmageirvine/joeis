package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018517 Divisors of 556.
 * @author Sean A. Irvine
 */
public class A018517 extends FiniteSequence {

  /** Construct the sequence. */
  public A018517() {
    super(1, FINITE, Jaguar.factor(556).divisorsSorted());
  }
}
