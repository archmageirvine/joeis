package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018517.
 * @author Sean A. Irvine
 */
public class A018517 extends FiniteSequence {

  /** Construct the sequence. */
  public A018517() {
    super(Cheetah.factor(556).divisorsSorted());
  }
}
