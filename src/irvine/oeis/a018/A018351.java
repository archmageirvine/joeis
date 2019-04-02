package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018351 Divisors of 242.
 * @author Sean A. Irvine
 */
public class A018351 extends FiniteSequence {

  /** Construct the sequence. */
  public A018351() {
    super(Cheetah.factor(242).divisorsSorted());
  }
}
