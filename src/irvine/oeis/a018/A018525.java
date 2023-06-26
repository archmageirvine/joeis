package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018525 Divisors of 572.
 * @author Sean A. Irvine
 */
public class A018525 extends FiniteSequence {

  /** Construct the sequence. */
  public A018525() {
    super(1, FINITE, Jaguar.factor(572).divisorsSorted());
  }
}
