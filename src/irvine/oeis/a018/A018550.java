package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018550 Divisors of 612.
 * @author Sean A. Irvine
 */
public class A018550 extends FiniteSequence {

  /** Construct the sequence. */
  public A018550() {
    super(Cheetah.factor(612).divisorsSorted());
  }
}
