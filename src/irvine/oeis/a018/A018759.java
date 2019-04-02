package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018759 Divisors of 986.
 * @author Sean A. Irvine
 */
public class A018759 extends FiniteSequence {

  /** Construct the sequence. */
  public A018759() {
    super(Cheetah.factor(986).divisorsSorted());
  }
}
