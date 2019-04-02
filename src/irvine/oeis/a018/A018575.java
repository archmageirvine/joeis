package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018575 Divisors of 656.
 * @author Sean A. Irvine
 */
public class A018575 extends FiniteSequence {

  /** Construct the sequence. */
  public A018575() {
    super(Cheetah.factor(656).divisorsSorted());
  }
}
