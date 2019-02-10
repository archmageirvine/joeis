package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018493.
 * @author Sean A. Irvine
 */
public class A018493 extends FiniteSequence {

  /** Construct the sequence. */
  public A018493() {
    super(Cheetah.factor(508).divisorsSorted());
  }
}
