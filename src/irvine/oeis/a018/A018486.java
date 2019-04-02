package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018486 Divisors of 495.
 * @author Sean A. Irvine
 */
public class A018486 extends FiniteSequence {

  /** Construct the sequence. */
  public A018486() {
    super(Cheetah.factor(495).divisorsSorted());
  }
}
