package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018354.
 * @author Sean A. Irvine
 */
public class A018354 extends FiniteSequence {

  /** Construct the sequence. */
  public A018354() {
    super(Cheetah.factor(246).divisorsSorted());
  }
}
