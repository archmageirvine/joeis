package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018636.
 * @author Sean A. Irvine
 */
public class A018636 extends FiniteSequence {

  /** Construct the sequence. */
  public A018636() {
    super(Cheetah.factor(770).divisorsSorted());
  }
}
