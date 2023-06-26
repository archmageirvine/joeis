package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018364 Divisors of 268.
 * @author Sean A. Irvine
 */
public class A018364 extends FiniteSequence {

  /** Construct the sequence. */
  public A018364() {
    super(1, FINITE, Jaguar.factor(268).divisorsSorted());
  }
}
