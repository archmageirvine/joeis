package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018638.
 * @author Sean A. Irvine
 */
public class A018638 extends FiniteSequence {

  /** Construct the sequence. */
  public A018638() {
    super(Cheetah.factor(774).divisorsSorted());
  }
}
