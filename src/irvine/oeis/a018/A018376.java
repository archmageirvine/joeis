package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018376.
 * @author Sean A. Irvine
 */
public class A018376 extends FiniteSequence {

  /** Construct the sequence. */
  public A018376() {
    super(Cheetah.factor(288).divisorsSorted());
  }
}
