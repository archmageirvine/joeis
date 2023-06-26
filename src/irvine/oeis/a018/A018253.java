package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018253 Divisors of 24.
 * @author Sean A. Irvine
 */
public class A018253 extends FiniteSequence {

  /** Construct the sequence. */
  public A018253() {
    super(1, FINITE, Jaguar.factor(24).divisorsSorted());
  }
}

