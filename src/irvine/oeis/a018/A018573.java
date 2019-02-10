package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018573.
 * @author Sean A. Irvine
 */
public class A018573 extends FiniteSequence {

  /** Construct the sequence. */
  public A018573() {
    super(Cheetah.factor(652).divisorsSorted());
  }
}
