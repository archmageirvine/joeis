package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018666 Divisors of 824.
 * @author Sean A. Irvine
 */
public class A018666 extends FiniteSequence {

  /** Construct the sequence. */
  public A018666() {
    super(Cheetah.factor(824).divisorsSorted());
  }
}
