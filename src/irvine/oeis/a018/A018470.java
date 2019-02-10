package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018470.
 * @author Sean A. Irvine
 */
public class A018470 extends FiniteSequence {

  /** Construct the sequence. */
  public A018470() {
    super(Cheetah.factor(465).divisorsSorted());
  }
}
