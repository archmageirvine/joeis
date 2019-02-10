package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018277.
 * @author Sean A. Irvine
 */
public class A018277 extends FiniteSequence {

  /** Construct the sequence. */
  public A018277() {
    super(Cheetah.factor(88).divisorsSorted());
  }
}
