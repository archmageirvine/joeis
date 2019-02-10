package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018560.
 * @author Sean A. Irvine
 */
public class A018560 extends FiniteSequence {

  /** Construct the sequence. */
  public A018560() {
    super(Cheetah.factor(632).divisorsSorted());
  }
}
