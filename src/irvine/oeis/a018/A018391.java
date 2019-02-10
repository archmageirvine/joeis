package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018391.
 * @author Sean A. Irvine
 */
public class A018391 extends FiniteSequence {

  /** Construct the sequence. */
  public A018391() {
    super(Cheetah.factor(320).divisorsSorted());
  }
}
