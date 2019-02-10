package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018415.
 * @author Sean A. Irvine
 */
public class A018415 extends FiniteSequence {

  /** Construct the sequence. */
  public A018415() {
    super(Cheetah.factor(366).divisorsSorted());
  }
}
