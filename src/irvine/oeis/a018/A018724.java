package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018724.
 * @author Sean A. Irvine
 */
public class A018724 extends FiniteSequence {

  /** Construct the sequence. */
  public A018724() {
    super(Cheetah.factor(925).divisorsSorted());
  }
}
