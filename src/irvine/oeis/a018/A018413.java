package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018413 Divisors of 363.
 * @author Sean A. Irvine
 */
public class A018413 extends FiniteSequence {

  /** Construct the sequence. */
  public A018413() {
    super(Cheetah.factor(363).divisorsSorted());
  }
}
