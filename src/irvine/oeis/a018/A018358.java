package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018358.
 * @author Sean A. Irvine
 */
public class A018358 extends FiniteSequence {

  /** Construct the sequence. */
  public A018358() {
    super(Cheetah.factor(255).divisorsSorted());
  }
}
