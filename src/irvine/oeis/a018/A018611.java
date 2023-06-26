package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018611 Divisors of 724.
 * @author Sean A. Irvine
 */
public class A018611 extends FiniteSequence {

  /** Construct the sequence. */
  public A018611() {
    super(1, FINITE, Jaguar.factor(724).divisorsSorted());
  }
}
