package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018690.
 * @author Sean A. Irvine
 */
public class A018690 extends FiniteSequence {

  /** Construct the sequence. */
  public A018690() {
    super(Cheetah.factor(864).divisorsSorted());
  }
}
