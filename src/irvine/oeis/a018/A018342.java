package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018342 Divisors of 225.
 * @author Sean A. Irvine
 */
public class A018342 extends FiniteSequence {

  /** Construct the sequence. */
  public A018342() {
    super(Cheetah.factor(225).divisorsSorted());
  }
}
