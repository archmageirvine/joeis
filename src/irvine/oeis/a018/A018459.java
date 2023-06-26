package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018459 Divisors of 442.
 * @author Sean A. Irvine
 */
public class A018459 extends FiniteSequence {

  /** Construct the sequence. */
  public A018459() {
    super(1, FINITE, Jaguar.factor(442).divisorsSorted());
  }
}
