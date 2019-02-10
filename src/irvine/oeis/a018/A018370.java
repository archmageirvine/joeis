package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018370.
 * @author Sean A. Irvine
 */
public class A018370 extends FiniteSequence {

  /** Construct the sequence. */
  public A018370() {
    super(Cheetah.factor(279).divisorsSorted());
  }
}
