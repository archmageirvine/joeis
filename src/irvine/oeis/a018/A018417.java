package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018417.
 * @author Sean A. Irvine
 */
public class A018417 extends FiniteSequence {

  /** Construct the sequence. */
  public A018417() {
    super(Cheetah.factor(369).divisorsSorted());
  }
}
