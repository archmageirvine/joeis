package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018592.
 * @author Sean A. Irvine
 */
public class A018592 extends FiniteSequence {

  /** Construct the sequence. */
  public A018592() {
    super(Cheetah.factor(686).divisorsSorted());
  }
}
