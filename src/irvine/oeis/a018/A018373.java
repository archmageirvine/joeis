package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018373.
 * @author Sean A. Irvine
 */
public class A018373 extends FiniteSequence {

  /** Construct the sequence. */
  public A018373() {
    super(Cheetah.factor(284).divisorsSorted());
  }
}
