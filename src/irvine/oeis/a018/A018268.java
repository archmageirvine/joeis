package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018268 Divisors of 66.
 * @author Sean A. Irvine
 */
public class A018268 extends FiniteSequence {

  /** Construct the sequence. */
  public A018268() {
    super(Cheetah.factor(66).divisorsSorted());
  }
}

