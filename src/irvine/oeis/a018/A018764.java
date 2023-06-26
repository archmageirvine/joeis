package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018764 Divisors of 994.
 * @author Sean A. Irvine
 */
public class A018764 extends FiniteSequence {

  /** Construct the sequence. */
  public A018764() {
    super(1, FINITE, Jaguar.factor(994).divisorsSorted());
  }
}
