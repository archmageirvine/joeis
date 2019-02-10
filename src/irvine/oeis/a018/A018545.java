package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018545.
 * @author Sean A. Irvine
 */
public class A018545 extends FiniteSequence {

  /** Construct the sequence. */
  public A018545() {
    super(Cheetah.factor(605).divisorsSorted());
  }
}
