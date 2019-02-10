package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018705.
 * @author Sean A. Irvine
 */
public class A018705 extends FiniteSequence {

  /** Construct the sequence. */
  public A018705() {
    super(Cheetah.factor(891).divisorsSorted());
  }
}
