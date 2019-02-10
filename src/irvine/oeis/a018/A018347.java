package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018347.
 * @author Sean A. Irvine
 */
public class A018347 extends FiniteSequence {

  /** Construct the sequence. */
  public A018347() {
    super(Cheetah.factor(234).divisorsSorted());
  }
}
