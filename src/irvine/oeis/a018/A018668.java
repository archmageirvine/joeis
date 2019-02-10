package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018668.
 * @author Sean A. Irvine
 */
public class A018668 extends FiniteSequence {

  /** Construct the sequence. */
  public A018668() {
    super(Cheetah.factor(826).divisorsSorted());
  }
}
