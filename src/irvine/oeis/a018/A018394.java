package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018394.
 * @author Sean A. Irvine
 */
public class A018394 extends FiniteSequence {

  /** Construct the sequence. */
  public A018394() {
    super(Cheetah.factor(325).divisorsSorted());
  }
}
