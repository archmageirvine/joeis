package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018309 Divisors of 156.
 * @author Sean A. Irvine
 */
public class A018309 extends FiniteSequence {

  /** Construct the sequence. */
  public A018309() {
    super(1, FINITE, Jaguar.factor(156).divisorsSorted());
  }
}
