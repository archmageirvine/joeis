package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018713.
 * @author Sean A. Irvine
 */
public class A018713 extends FiniteSequence {

  /** Construct the sequence. */
  public A018713() {
    super(Cheetah.factor(904).divisorsSorted());
  }
}
