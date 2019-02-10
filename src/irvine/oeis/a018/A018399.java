package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018399.
 * @author Sean A. Irvine
 */
public class A018399 extends FiniteSequence {

  /** Construct the sequence. */
  public A018399() {
    super(Cheetah.factor(336).divisorsSorted());
  }
}
