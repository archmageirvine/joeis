package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018387.
 * @author Sean A. Irvine
 */
public class A018387 extends FiniteSequence {

  /** Construct the sequence. */
  public A018387() {
    super(Cheetah.factor(312).divisorsSorted());
  }
}
