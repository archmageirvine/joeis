package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018526.
 * @author Sean A. Irvine
 */
public class A018526 extends FiniteSequence {

  /** Construct the sequence. */
  public A018526() {
    super(Cheetah.factor(574).divisorsSorted());
  }
}
