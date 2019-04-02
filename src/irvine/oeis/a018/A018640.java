package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018640 Divisors of 776.
 * @author Sean A. Irvine
 */
public class A018640 extends FiniteSequence {

  /** Construct the sequence. */
  public A018640() {
    super(Cheetah.factor(776).divisorsSorted());
  }
}
