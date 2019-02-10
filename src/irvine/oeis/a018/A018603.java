package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018603.
 * @author Sean A. Irvine
 */
public class A018603 extends FiniteSequence {

  /** Construct the sequence. */
  public A018603() {
    super(Cheetah.factor(710).divisorsSorted());
  }
}
