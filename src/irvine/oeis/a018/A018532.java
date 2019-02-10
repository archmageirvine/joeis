package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018532.
 * @author Sean A. Irvine
 */
public class A018532 extends FiniteSequence {

  /** Construct the sequence. */
  public A018532() {
    super(Cheetah.factor(584).divisorsSorted());
  }
}
