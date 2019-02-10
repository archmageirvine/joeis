package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018301.
 * @author Sean A. Irvine
 */
public class A018301 extends FiniteSequence {

  /** Construct the sequence. */
  public A018301() {
    super(Cheetah.factor(140).divisorsSorted());
  }
}
