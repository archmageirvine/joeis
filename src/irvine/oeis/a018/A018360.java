package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018360.
 * @author Sean A. Irvine
 */
public class A018360 extends FiniteSequence {

  /** Construct the sequence. */
  public A018360() {
    super(Cheetah.factor(260).divisorsSorted());
  }
}
