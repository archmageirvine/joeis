package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018439.
 * @author Sean A. Irvine
 */
public class A018439 extends FiniteSequence {

  /** Construct the sequence. */
  public A018439() {
    super(Cheetah.factor(410).divisorsSorted());
  }
}
