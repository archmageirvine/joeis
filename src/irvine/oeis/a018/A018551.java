package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018551 Divisors of 615.
 * @author Sean A. Irvine
 */
public class A018551 extends FiniteSequence {

  /** Construct the sequence. */
  public A018551() {
    super(Cheetah.factor(615).divisorsSorted());
  }
}
