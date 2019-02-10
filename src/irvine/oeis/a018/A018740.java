package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018740.
 * @author Sean A. Irvine
 */
public class A018740 extends FiniteSequence {

  /** Construct the sequence. */
  public A018740() {
    super(Cheetah.factor(952).divisorsSorted());
  }
}
