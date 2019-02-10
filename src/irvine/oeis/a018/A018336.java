package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018336.
 * @author Sean A. Irvine
 */
public class A018336 extends FiniteSequence {

  /** Construct the sequence. */
  public A018336() {
    super(Cheetah.factor(210).divisorsSorted());
  }
}
