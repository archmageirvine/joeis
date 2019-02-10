package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018588.
 * @author Sean A. Irvine
 */
public class A018588 extends FiniteSequence {

  /** Construct the sequence. */
  public A018588() {
    super(Cheetah.factor(678).divisorsSorted());
  }
}
