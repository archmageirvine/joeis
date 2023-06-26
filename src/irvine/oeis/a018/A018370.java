package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018370 Divisors of 279.
 * @author Sean A. Irvine
 */
public class A018370 extends FiniteSequence {

  /** Construct the sequence. */
  public A018370() {
    super(1, FINITE, Jaguar.factor(279).divisorsSorted());
  }
}
