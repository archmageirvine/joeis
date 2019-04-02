package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018497 Divisors of 518.
 * @author Sean A. Irvine
 */
public class A018497 extends FiniteSequence {

  /** Construct the sequence. */
  public A018497() {
    super(Cheetah.factor(518).divisorsSorted());
  }
}
