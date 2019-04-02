package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018466 Divisors of 459.
 * @author Sean A. Irvine
 */
public class A018466 extends FiniteSequence {

  /** Construct the sequence. */
  public A018466() {
    super(Cheetah.factor(459).divisorsSorted());
  }
}
