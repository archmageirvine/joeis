package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018574 Divisors of 654.
 * @author Sean A. Irvine
 */
public class A018574 extends FiniteSequence {

  /** Construct the sequence. */
  public A018574() {
    super(1, FINITE, Jaguar.factor(654).divisorsSorted());
  }
}
