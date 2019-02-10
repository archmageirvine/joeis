package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018670.
 * @author Sean A. Irvine
 */
public class A018670 extends FiniteSequence {

  /** Construct the sequence. */
  public A018670() {
    super(Cheetah.factor(830).divisorsSorted());
  }
}
