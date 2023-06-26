package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018464 Divisors of 455.
 * @author Sean A. Irvine
 */
public class A018464 extends FiniteSequence {

  /** Construct the sequence. */
  public A018464() {
    super(1, FINITE, Jaguar.factor(455).divisorsSorted());
  }
}
