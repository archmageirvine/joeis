package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018500 Divisors of 524.
 * @author Sean A. Irvine
 */
public class A018500 extends FiniteSequence {

  /** Construct the sequence. */
  public A018500() {
    super(Cheetah.factor(524).divisorsSorted());
  }
}
