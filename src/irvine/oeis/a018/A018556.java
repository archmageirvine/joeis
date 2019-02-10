package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018556.
 * @author Sean A. Irvine
 */
public class A018556 extends FiniteSequence {

  /** Construct the sequence. */
  public A018556() {
    super(Cheetah.factor(624).divisorsSorted());
  }
}
