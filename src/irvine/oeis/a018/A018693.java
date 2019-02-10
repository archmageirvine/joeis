package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018693.
 * @author Sean A. Irvine
 */
public class A018693 extends FiniteSequence {

  /** Construct the sequence. */
  public A018693() {
    super(Cheetah.factor(870).divisorsSorted());
  }
}
