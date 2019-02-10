package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018392.
 * @author Sean A. Irvine
 */
public class A018392 extends FiniteSequence {

  /** Construct the sequence. */
  public A018392() {
    super(Cheetah.factor(322).divisorsSorted());
  }
}
