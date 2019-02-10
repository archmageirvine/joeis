package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018338.
 * @author Sean A. Irvine
 */
public class A018338 extends FiniteSequence {

  /** Construct the sequence. */
  public A018338() {
    super(Cheetah.factor(216).divisorsSorted());
  }
}
