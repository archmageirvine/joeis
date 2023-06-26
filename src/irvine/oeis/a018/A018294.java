package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018294 Divisors of 124.
 * @author Sean A. Irvine
 */
public class A018294 extends FiniteSequence {

  /** Construct the sequence. */
  public A018294() {
    super(1, FINITE, Jaguar.factor(124).divisorsSorted());
  }
}
