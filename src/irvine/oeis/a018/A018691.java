package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018691.
 * @author Sean A. Irvine
 */
public class A018691 extends FiniteSequence {

  /** Construct the sequence. */
  public A018691() {
    super(Cheetah.factor(867).divisorsSorted());
  }
}
