package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018396.
 * @author Sean A. Irvine
 */
public class A018396 extends FiniteSequence {

  /** Construct the sequence. */
  public A018396() {
    super(Cheetah.factor(330).divisorsSorted());
  }
}
