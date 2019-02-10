package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018478.
 * @author Sean A. Irvine
 */
public class A018478 extends FiniteSequence {

  /** Construct the sequence. */
  public A018478() {
    super(Cheetah.factor(480).divisorsSorted());
  }
}
