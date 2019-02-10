package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018534.
 * @author Sean A. Irvine
 */
public class A018534 extends FiniteSequence {

  /** Construct the sequence. */
  public A018534() {
    super(Cheetah.factor(588).divisorsSorted());
  }
}
