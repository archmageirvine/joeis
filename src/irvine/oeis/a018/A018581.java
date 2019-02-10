package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018581.
 * @author Sean A. Irvine
 */
public class A018581 extends FiniteSequence {

  /** Construct the sequence. */
  public A018581() {
    super(Cheetah.factor(665).divisorsSorted());
  }
}
