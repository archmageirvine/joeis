package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018630 Divisors of 759.
 * @author Sean A. Irvine
 */
public class A018630 extends FiniteSequence {

  /** Construct the sequence. */
  public A018630() {
    super(1, FINITE, Jaguar.factor(759).divisorsSorted());
  }
}
