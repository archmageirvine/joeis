package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018378 Divisors of 292.
 * @author Sean A. Irvine
 */
public class A018378 extends FiniteSequence {

  /** Construct the sequence. */
  public A018378() {
    super(1, FINITE, Jaguar.factor(292).divisorsSorted());
  }
}
