package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018313.
 * @author Sean A. Irvine
 */
public class A018313 extends FiniteSequence {

  /** Construct the sequence. */
  public A018313() {
    super(Cheetah.factor(165).divisorsSorted());
  }
}
