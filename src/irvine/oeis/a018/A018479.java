package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018479.
 * @author Sean A. Irvine
 */
public class A018479 extends FiniteSequence {

  /** Construct the sequence. */
  public A018479() {
    super(Cheetah.factor(483).divisorsSorted());
  }
}
