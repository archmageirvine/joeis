package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018595.
 * @author Sean A. Irvine
 */
public class A018595 extends FiniteSequence {

  /** Construct the sequence. */
  public A018595() {
    super(Cheetah.factor(692).divisorsSorted());
  }
}
