package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018630 Divisors of 759.
 * @author Sean A. Irvine
 */
public class A018630 extends FiniteSequence {

  /** Construct the sequence. */
  public A018630() {
    super(Cheetah.factor(759).divisorsSorted());
  }
}
