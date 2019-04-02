package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018452 Divisors of 432.
 * @author Sean A. Irvine
 */
public class A018452 extends FiniteSequence {

  /** Construct the sequence. */
  public A018452() {
    super(Cheetah.factor(432).divisorsSorted());
  }
}
