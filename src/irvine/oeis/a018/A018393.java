package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018393.
 * @author Sean A. Irvine
 */
public class A018393 extends FiniteSequence {

  /** Construct the sequence. */
  public A018393() {
    super(Cheetah.factor(324).divisorsSorted());
  }
}
