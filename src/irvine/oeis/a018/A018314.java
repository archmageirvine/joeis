package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018314.
 * @author Sean A. Irvine
 */
public class A018314 extends FiniteSequence {

  /** Construct the sequence. */
  public A018314() {
    super(Cheetah.factor(168).divisorsSorted());
  }
}
