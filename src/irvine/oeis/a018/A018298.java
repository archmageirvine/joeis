package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018298 Divisors of 135.
 * @author Sean A. Irvine
 */
public class A018298 extends FiniteSequence {

  /** Construct the sequence. */
  public A018298() {
    super(Cheetah.factor(135).divisorsSorted());
  }
}
