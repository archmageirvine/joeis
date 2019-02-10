package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018732.
 * @author Sean A. Irvine
 */
public class A018732 extends FiniteSequence {

  /** Construct the sequence. */
  public A018732() {
    super(Cheetah.factor(938).divisorsSorted());
  }
}
