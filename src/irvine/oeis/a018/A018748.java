package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018748 Divisors of 966.
 * @author Sean A. Irvine
 */
public class A018748 extends FiniteSequence {

  /** Construct the sequence. */
  public A018748() {
    super(Cheetah.factor(966).divisorsSorted());
  }
}
