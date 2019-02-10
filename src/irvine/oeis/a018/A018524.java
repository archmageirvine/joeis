package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018524.
 * @author Sean A. Irvine
 */
public class A018524 extends FiniteSequence {

  /** Construct the sequence. */
  public A018524() {
    super(Cheetah.factor(570).divisorsSorted());
  }
}
