package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018687.
 * @author Sean A. Irvine
 */
public class A018687 extends FiniteSequence {

  /** Construct the sequence. */
  public A018687() {
    super(Cheetah.factor(858).divisorsSorted());
  }
}
