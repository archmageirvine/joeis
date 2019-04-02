package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018483 Divisors of 490.
 * @author Sean A. Irvine
 */
public class A018483 extends FiniteSequence {

  /** Construct the sequence. */
  public A018483() {
    super(Cheetah.factor(490).divisorsSorted());
  }
}
