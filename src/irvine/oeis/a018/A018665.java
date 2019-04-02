package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018665 Divisors of 822.
 * @author Sean A. Irvine
 */
public class A018665 extends FiniteSequence {

  /** Construct the sequence. */
  public A018665() {
    super(Cheetah.factor(822).divisorsSorted());
  }
}
