package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018337 Divisors of 212.
 * @author Sean A. Irvine
 */
public class A018337 extends FiniteSequence {

  /** Construct the sequence. */
  public A018337() {
    super(Cheetah.factor(212).divisorsSorted());
  }
}
