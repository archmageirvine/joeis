package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018379.
 * @author Sean A. Irvine
 */
public class A018379 extends FiniteSequence {

  /** Construct the sequence. */
  public A018379() {
    super(Cheetah.factor(294).divisorsSorted());
  }
}
