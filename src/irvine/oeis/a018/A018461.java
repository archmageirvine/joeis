package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018461.
 * @author Sean A. Irvine
 */
public class A018461 extends FiniteSequence {

  /** Construct the sequence. */
  public A018461() {
    super(Cheetah.factor(448).divisorsSorted());
  }
}
