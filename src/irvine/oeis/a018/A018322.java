package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018322 Divisors of 182.
 * @author Sean A. Irvine
 */
public class A018322 extends FiniteSequence {

  /** Construct the sequence. */
  public A018322() {
    super(Cheetah.factor(182).divisorsSorted());
  }
}
