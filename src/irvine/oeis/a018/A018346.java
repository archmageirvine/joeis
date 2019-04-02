package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018346 Divisors of 232.
 * @author Sean A. Irvine
 */
public class A018346 extends FiniteSequence {

  /** Construct the sequence. */
  public A018346() {
    super(Cheetah.factor(232).divisorsSorted());
  }
}
