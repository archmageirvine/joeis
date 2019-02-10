package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018459.
 * @author Sean A. Irvine
 */
public class A018459 extends FiniteSequence {

  /** Construct the sequence. */
  public A018459() {
    super(Cheetah.factor(442).divisorsSorted());
  }
}
