package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018381 Divisors of 297.
 * @author Sean A. Irvine
 */
public class A018381 extends FiniteSequence {

  /** Construct the sequence. */
  public A018381() {
    super(Cheetah.factor(297).divisorsSorted());
  }
}
