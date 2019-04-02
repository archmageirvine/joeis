package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018366 Divisors of 272.
 * @author Sean A. Irvine
 */
public class A018366 extends FiniteSequence {

  /** Construct the sequence. */
  public A018366() {
    super(Cheetah.factor(272).divisorsSorted());
  }
}
