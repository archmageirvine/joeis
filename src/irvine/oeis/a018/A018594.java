package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018594.
 * @author Sean A. Irvine
 */
public class A018594 extends FiniteSequence {

  /** Construct the sequence. */
  public A018594() {
    super(Cheetah.factor(690).divisorsSorted());
  }
}
