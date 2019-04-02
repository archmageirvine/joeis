package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018727 Divisors of 930.
 * @author Sean A. Irvine
 */
public class A018727 extends FiniteSequence {

  /** Construct the sequence. */
  public A018727() {
    super(Cheetah.factor(930).divisorsSorted());
  }
}
