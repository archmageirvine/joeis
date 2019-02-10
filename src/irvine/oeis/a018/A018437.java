package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018437.
 * @author Sean A. Irvine
 */
public class A018437 extends FiniteSequence {

  /** Construct the sequence. */
  public A018437() {
    super(Cheetah.factor(406).divisorsSorted());
  }
}
