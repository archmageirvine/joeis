package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018624.
 * @author Sean A. Irvine
 */
public class A018624 extends FiniteSequence {

  /** Construct the sequence. */
  public A018624() {
    super(Cheetah.factor(747).divisorsSorted());
  }
}
