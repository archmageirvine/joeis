package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018400 Divisors of 338.
 * @author Sean A. Irvine
 */
public class A018400 extends FiniteSequence {

  /** Construct the sequence. */
  public A018400() {
    super(1, FINITE, Jaguar.factor(338).divisorsSorted());
  }
}
