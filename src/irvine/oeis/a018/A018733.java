package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018733.
 * @author Sean A. Irvine
 */
public class A018733 extends FiniteSequence {

  /** Construct the sequence. */
  public A018733() {
    super(Cheetah.factor(940).divisorsSorted());
  }
}
