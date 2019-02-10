package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018671.
 * @author Sean A. Irvine
 */
public class A018671 extends FiniteSequence {

  /** Construct the sequence. */
  public A018671() {
    super(Cheetah.factor(832).divisorsSorted());
  }
}
