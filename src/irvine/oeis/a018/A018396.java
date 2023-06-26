package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018396 Divisors of 330.
 * @author Sean A. Irvine
 */
public class A018396 extends FiniteSequence {

  /** Construct the sequence. */
  public A018396() {
    super(1, FINITE, Jaguar.factor(330).divisorsSorted());
  }
}
