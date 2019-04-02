package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018688 Divisors of 860.
 * @author Sean A. Irvine
 */
public class A018688 extends FiniteSequence {

  /** Construct the sequence. */
  public A018688() {
    super(Cheetah.factor(860).divisorsSorted());
  }
}
