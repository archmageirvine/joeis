package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018562.
 * @author Sean A. Irvine
 */
public class A018562 extends FiniteSequence {

  /** Construct the sequence. */
  public A018562() {
    super(Cheetah.factor(637).divisorsSorted());
  }
}
