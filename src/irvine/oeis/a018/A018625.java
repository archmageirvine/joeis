package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018625.
 * @author Sean A. Irvine
 */
public class A018625 extends FiniteSequence {

  /** Construct the sequence. */
  public A018625() {
    super(Cheetah.factor(748).divisorsSorted());
  }
}
