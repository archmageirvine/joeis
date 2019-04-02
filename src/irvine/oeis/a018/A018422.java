package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018422 Divisors of 376.
 * @author Sean A. Irvine
 */
public class A018422 extends FiniteSequence {

  /** Construct the sequence. */
  public A018422() {
    super(Cheetah.factor(376).divisorsSorted());
  }
}
