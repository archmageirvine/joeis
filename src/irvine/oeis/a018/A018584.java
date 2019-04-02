package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018584 Divisors of 670.
 * @author Sean A. Irvine
 */
public class A018584 extends FiniteSequence {

  /** Construct the sequence. */
  public A018584() {
    super(Cheetah.factor(670).divisorsSorted());
  }
}
