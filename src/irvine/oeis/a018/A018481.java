package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018481.
 * @author Sean A. Irvine
 */
public class A018481 extends FiniteSequence {

  /** Construct the sequence. */
  public A018481() {
    super(Cheetah.factor(486).divisorsSorted());
  }
}
