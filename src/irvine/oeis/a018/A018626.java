package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018626.
 * @author Sean A. Irvine
 */
public class A018626 extends FiniteSequence {

  /** Construct the sequence. */
  public A018626() {
    super(Cheetah.factor(750).divisorsSorted());
  }
}
