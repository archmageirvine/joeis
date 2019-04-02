package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018615 Divisors of 730.
 * @author Sean A. Irvine
 */
public class A018615 extends FiniteSequence {

  /** Construct the sequence. */
  public A018615() {
    super(Cheetah.factor(730).divisorsSorted());
  }
}
