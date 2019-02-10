package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018304.
 * @author Sean A. Irvine
 */
public class A018304 extends FiniteSequence {

  /** Construct the sequence. */
  public A018304() {
    super(Cheetah.factor(148).divisorsSorted());
  }
}
