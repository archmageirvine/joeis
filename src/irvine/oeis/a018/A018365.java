package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018365 Divisors of 270.
 * @author Sean A. Irvine
 */
public class A018365 extends FiniteSequence {

  /** Construct the sequence. */
  public A018365() {
    super(Cheetah.factor(270).divisorsSorted());
  }
}
