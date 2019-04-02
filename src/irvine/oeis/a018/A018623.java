package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018623 Divisors of 744.
 * @author Sean A. Irvine
 */
public class A018623 extends FiniteSequence {

  /** Construct the sequence. */
  public A018623() {
    super(Cheetah.factor(744).divisorsSorted());
  }
}
