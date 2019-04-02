package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018605 Divisors of 712.
 * @author Sean A. Irvine
 */
public class A018605 extends FiniteSequence {

  /** Construct the sequence. */
  public A018605() {
    super(Cheetah.factor(712).divisorsSorted());
  }
}
