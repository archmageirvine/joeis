package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018598.
 * @author Sean A. Irvine
 */
public class A018598 extends FiniteSequence {

  /** Construct the sequence. */
  public A018598() {
    super(Cheetah.factor(700).divisorsSorted());
  }
}
