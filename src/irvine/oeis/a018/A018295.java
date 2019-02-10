package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018295.
 * @author Sean A. Irvine
 */
public class A018295 extends FiniteSequence {

  /** Construct the sequence. */
  public A018295() {
    super(Cheetah.factor(126).divisorsSorted());
  }
}
