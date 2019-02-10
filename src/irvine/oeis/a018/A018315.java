package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018315.
 * @author Sean A. Irvine
 */
public class A018315 extends FiniteSequence {

  /** Construct the sequence. */
  public A018315() {
    super(Cheetah.factor(170).divisorsSorted());
  }
}
