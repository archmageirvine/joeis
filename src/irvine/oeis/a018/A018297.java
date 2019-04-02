package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018297 Divisors of 132.
 * @author Sean A. Irvine
 */
public class A018297 extends FiniteSequence {

  /** Construct the sequence. */
  public A018297() {
    super(Cheetah.factor(132).divisorsSorted());
  }
}
