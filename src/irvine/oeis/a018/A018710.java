package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018710.
 * @author Sean A. Irvine
 */
public class A018710 extends FiniteSequence {

  /** Construct the sequence. */
  public A018710() {
    super(Cheetah.factor(900).divisorsSorted());
  }
}
