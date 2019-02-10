package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018525.
 * @author Sean A. Irvine
 */
public class A018525 extends FiniteSequence {

  /** Construct the sequence. */
  public A018525() {
    super(Cheetah.factor(572).divisorsSorted());
  }
}
