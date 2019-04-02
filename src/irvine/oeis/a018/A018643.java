package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018643 Divisors of 782.
 * @author Sean A. Irvine
 */
public class A018643 extends FiniteSequence {

  /** Construct the sequence. */
  public A018643() {
    super(Cheetah.factor(782).divisorsSorted());
  }
}
