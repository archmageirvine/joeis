package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018511 Divisors of 546.
 * @author Sean A. Irvine
 */
public class A018511 extends FiniteSequence {

  /** Construct the sequence. */
  public A018511() {
    super(1, FINITE, Jaguar.factor(546).divisorsSorted());
  }
}
