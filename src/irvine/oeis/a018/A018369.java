package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018369 Divisors of 276.
 * @author Sean A. Irvine
 */
public class A018369 extends FiniteSequence {

  /** Construct the sequence. */
  public A018369() {
    super(1, FINITE, Jaguar.factor(276).divisorsSorted());
  }
}
