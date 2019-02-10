package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018431.
 * @author Sean A. Irvine
 */
public class A018431 extends FiniteSequence {

  /** Construct the sequence. */
  public A018431() {
    super(Cheetah.factor(396).divisorsSorted());
  }
}
