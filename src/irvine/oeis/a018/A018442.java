package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018442.
 * @author Sean A. Irvine
 */
public class A018442 extends FiniteSequence {

  /** Construct the sequence. */
  public A018442() {
    super(Cheetah.factor(416).divisorsSorted());
  }
}
