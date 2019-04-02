package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018432 Divisors of 399.
 * @author Sean A. Irvine
 */
public class A018432 extends FiniteSequence {

  /** Construct the sequence. */
  public A018432() {
    super(Cheetah.factor(399).divisorsSorted());
  }
}
