package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018323.
 * @author Sean A. Irvine
 */
public class A018323 extends FiniteSequence {

  /** Construct the sequence. */
  public A018323() {
    super(Cheetah.factor(184).divisorsSorted());
  }
}
