package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018363.
 * @author Sean A. Irvine
 */
public class A018363 extends FiniteSequence {

  /** Construct the sequence. */
  public A018363() {
    super(Cheetah.factor(266).divisorsSorted());
  }
}
