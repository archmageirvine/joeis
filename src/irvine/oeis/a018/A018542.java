package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018542 Divisors of 602.
 * @author Sean A. Irvine
 */
public class A018542 extends FiniteSequence {

  /** Construct the sequence. */
  public A018542() {
    super(Cheetah.factor(602).divisorsSorted());
  }
}
