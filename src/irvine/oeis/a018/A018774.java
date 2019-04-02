package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018774 Divisors of 1012.
 * @author Sean A. Irvine
 */
public class A018774 extends FiniteSequence {

  /** Construct the sequence. */
  public A018774() {
    super(Cheetah.factor(1012).divisorsSorted());
  }
}
