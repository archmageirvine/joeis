package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018607.
 * @author Sean A. Irvine
 */
public class A018607 extends FiniteSequence {

  /** Construct the sequence. */
  public A018607() {
    super(Cheetah.factor(715).divisorsSorted());
  }
}
