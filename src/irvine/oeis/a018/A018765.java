package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018765.
 * @author Sean A. Irvine
 */
public class A018765 extends FiniteSequence {

  /** Construct the sequence. */
  public A018765() {
    super(Cheetah.factor(996).divisorsSorted());
  }
}
