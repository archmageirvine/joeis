package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018519 Divisors of 560.
 * @author Sean A. Irvine
 */
public class A018519 extends FiniteSequence {

  /** Construct the sequence. */
  public A018519() {
    super(1, FINITE, Jaguar.factor(560).divisorsSorted());
  }
}
