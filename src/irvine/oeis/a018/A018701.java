package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018701.
 * @author Sean A. Irvine
 */
public class A018701 extends FiniteSequence {

  /** Construct the sequence. */
  public A018701() {
    super(Cheetah.factor(884).divisorsSorted());
  }
}
