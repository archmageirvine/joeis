package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018482.
 * @author Sean A. Irvine
 */
public class A018482 extends FiniteSequence {

  /** Construct the sequence. */
  public A018482() {
    super(Cheetah.factor(488).divisorsSorted());
  }
}
