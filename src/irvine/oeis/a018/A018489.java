package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018489 Divisors of 500.
 * @author Sean A. Irvine
 */
public class A018489 extends FiniteSequence {

  /** Construct the sequence. */
  public A018489() {
    super(1, FINITE, Jaguar.factor(500).divisorsSorted());
  }
}
