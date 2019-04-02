package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018655 Divisors of 804.
 * @author Sean A. Irvine
 */
public class A018655 extends FiniteSequence {

  /** Construct the sequence. */
  public A018655() {
    super(Cheetah.factor(804).divisorsSorted());
  }
}
