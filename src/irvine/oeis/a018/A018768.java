package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018768.
 * @author Sean A. Irvine
 */
public class A018768 extends FiniteSequence {

  /** Construct the sequence. */
  public A018768() {
    super(Cheetah.factor(1001).divisorsSorted());
  }
}
