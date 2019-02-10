package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018335.
 * @author Sean A. Irvine
 */
public class A018335 extends FiniteSequence {

  /** Construct the sequence. */
  public A018335() {
    super(Cheetah.factor(208).divisorsSorted());
  }
}
