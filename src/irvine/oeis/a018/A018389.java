package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018389 Divisors of 316.
 * @author Sean A. Irvine
 */
public class A018389 extends FiniteSequence {

  /** Construct the sequence. */
  public A018389() {
    super(1, FINITE, Jaguar.factor(316).divisorsSorted());
  }
}
