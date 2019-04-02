package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018530 Divisors of 580.
 * @author Sean A. Irvine
 */
public class A018530 extends FiniteSequence {

  /** Construct the sequence. */
  public A018530() {
    super(Cheetah.factor(580).divisorsSorted());
  }
}
