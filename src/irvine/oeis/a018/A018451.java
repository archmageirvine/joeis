package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018451 Divisors of 430.
 * @author Sean A. Irvine
 */
public class A018451 extends FiniteSequence {

  /** Construct the sequence. */
  public A018451() {
    super(Cheetah.factor(430).divisorsSorted());
  }
}
