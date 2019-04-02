package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018510 Divisors of 544.
 * @author Sean A. Irvine
 */
public class A018510 extends FiniteSequence {

  /** Construct the sequence. */
  public A018510() {
    super(Cheetah.factor(544).divisorsSorted());
  }
}
