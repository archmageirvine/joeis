package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018627.
 * @author Sean A. Irvine
 */
public class A018627 extends FiniteSequence {

  /** Construct the sequence. */
  public A018627() {
    super(Cheetah.factor(752).divisorsSorted());
  }
}
