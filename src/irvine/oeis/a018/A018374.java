package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018374 Divisors of 285.
 * @author Sean A. Irvine
 */
public class A018374 extends FiniteSequence {

  /** Construct the sequence. */
  public A018374() {
    super(1, FINITE, Jaguar.factor(285).divisorsSorted());
  }
}
