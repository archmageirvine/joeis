package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018403.
 * @author Sean A. Irvine
 */
public class A018403 extends FiniteSequence {

  /** Construct the sequence. */
  public A018403() {
    super(Cheetah.factor(344).divisorsSorted());
  }
}
