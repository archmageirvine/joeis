package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018368.
 * @author Sean A. Irvine
 */
public class A018368 extends FiniteSequence {

  /** Construct the sequence. */
  public A018368() {
    super(Cheetah.factor(275).divisorsSorted());
  }
}
