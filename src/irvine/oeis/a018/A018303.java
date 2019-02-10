package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018303.
 * @author Sean A. Irvine
 */
public class A018303 extends FiniteSequence {

  /** Construct the sequence. */
  public A018303() {
    super(Cheetah.factor(147).divisorsSorted());
  }
}
