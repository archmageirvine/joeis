package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018341.
 * @author Sean A. Irvine
 */
public class A018341 extends FiniteSequence {

  /** Construct the sequence. */
  public A018341() {
    super(Cheetah.factor(224).divisorsSorted());
  }
}
