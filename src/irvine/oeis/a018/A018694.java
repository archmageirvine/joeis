package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018694.
 * @author Sean A. Irvine
 */
public class A018694 extends FiniteSequence {

  /** Construct the sequence. */
  public A018694() {
    super(Cheetah.factor(872).divisorsSorted());
  }
}
