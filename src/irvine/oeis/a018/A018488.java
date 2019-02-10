package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018488.
 * @author Sean A. Irvine
 */
public class A018488 extends FiniteSequence {

  /** Construct the sequence. */
  public A018488() {
    super(Cheetah.factor(498).divisorsSorted());
  }
}
