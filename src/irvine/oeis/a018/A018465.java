package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018465.
 * @author Sean A. Irvine
 */
public class A018465 extends FiniteSequence {

  /** Construct the sequence. */
  public A018465() {
    super(Cheetah.factor(456).divisorsSorted());
  }
}
