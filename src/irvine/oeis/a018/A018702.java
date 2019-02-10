package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018702.
 * @author Sean A. Irvine
 */
public class A018702 extends FiniteSequence {

  /** Construct the sequence. */
  public A018702() {
    super(Cheetah.factor(885).divisorsSorted());
  }
}
