package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018400 Divisors of 338.
 * @author Sean A. Irvine
 */
public class A018400 extends FiniteSequence {

  /** Construct the sequence. */
  public A018400() {
    super(Cheetah.factor(338).divisorsSorted());
  }
}
