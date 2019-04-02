package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018441 Divisors of 414.
 * @author Sean A. Irvine
 */
public class A018441 extends FiniteSequence {

  /** Construct the sequence. */
  public A018441() {
    super(Cheetah.factor(414).divisorsSorted());
  }
}
