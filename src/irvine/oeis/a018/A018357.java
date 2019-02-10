package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018357.
 * @author Sean A. Irvine
 */
public class A018357 extends FiniteSequence {

  /** Construct the sequence. */
  public A018357() {
    super(Cheetah.factor(252).divisorsSorted());
  }
}
