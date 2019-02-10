package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018446.
 * @author Sean A. Irvine
 */
public class A018446 extends FiniteSequence {

  /** Construct the sequence. */
  public A018446() {
    super(Cheetah.factor(424).divisorsSorted());
  }
}
