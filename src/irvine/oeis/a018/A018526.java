package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018526 Divisors of 574.
 * @author Sean A. Irvine
 */
public class A018526 extends FiniteSequence {

  /** Construct the sequence. */
  public A018526() {
    super(1, FINITE, Jaguar.factor(574).divisorsSorted());
  }
}
