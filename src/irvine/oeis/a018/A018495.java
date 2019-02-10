package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018495.
 * @author Sean A. Irvine
 */
public class A018495 extends FiniteSequence {

  /** Construct the sequence. */
  public A018495() {
    super(Cheetah.factor(513).divisorsSorted());
  }
}
