package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018743.
 * @author Sean A. Irvine
 */
public class A018743 extends FiniteSequence {

  /** Construct the sequence. */
  public A018743() {
    super(Cheetah.factor(957).divisorsSorted());
  }
}
