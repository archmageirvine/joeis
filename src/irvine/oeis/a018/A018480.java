package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018480 Divisors of 484.
 * @author Sean A. Irvine
 */
public class A018480 extends FiniteSequence {

  /** Construct the sequence. */
  public A018480() {
    super(Cheetah.factor(484).divisorsSorted());
  }
}
