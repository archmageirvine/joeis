package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018306 Divisors of 152.
 * @author Sean A. Irvine
 */
public class A018306 extends FiniteSequence {

  /** Construct the sequence. */
  public A018306() {
    super(Cheetah.factor(152).divisorsSorted());
  }
}
