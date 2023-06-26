package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018316 Divisors of 171.
 * @author Sean A. Irvine
 */
public class A018316 extends FiniteSequence {

  /** Construct the sequence. */
  public A018316() {
    super(1, FINITE, Jaguar.factor(171).divisorsSorted());
  }
}
