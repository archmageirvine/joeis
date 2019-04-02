package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018383 Divisors of 304.
 * @author Sean A. Irvine
 */
public class A018383 extends FiniteSequence {

  /** Construct the sequence. */
  public A018383() {
    super(Cheetah.factor(304).divisorsSorted());
  }
}
