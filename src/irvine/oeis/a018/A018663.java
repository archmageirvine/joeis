package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018663.
 * @author Sean A. Irvine
 */
public class A018663 extends FiniteSequence {

  /** Construct the sequence. */
  public A018663() {
    super(Cheetah.factor(819).divisorsSorted());
  }
}
