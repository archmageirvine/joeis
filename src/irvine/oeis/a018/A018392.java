package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018392 Divisors of 322.
 * @author Sean A. Irvine
 */
public class A018392 extends FiniteSequence {

  /** Construct the sequence. */
  public A018392() {
    super(1, FINITE, Jaguar.factor(322).divisorsSorted());
  }
}
