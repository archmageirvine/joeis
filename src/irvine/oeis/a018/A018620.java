package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018620 Divisors of 740.
 * @author Sean A. Irvine
 */
public class A018620 extends FiniteSequence {

  /** Construct the sequence. */
  public A018620() {
    super(Cheetah.factor(740).divisorsSorted());
  }
}
