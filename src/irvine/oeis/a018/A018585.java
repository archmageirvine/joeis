package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018585 Divisors of 672.
 * @author Sean A. Irvine
 */
public class A018585 extends FiniteSequence {

  /** Construct the sequence. */
  public A018585() {
    super(Cheetah.factor(672).divisorsSorted());
  }
}
