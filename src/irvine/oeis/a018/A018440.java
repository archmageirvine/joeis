package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018440 Divisors of 412.
 * @author Sean A. Irvine
 */
public class A018440 extends FiniteSequence {

  /** Construct the sequence. */
  public A018440() {
    super(Cheetah.factor(412).divisorsSorted());
  }
}
