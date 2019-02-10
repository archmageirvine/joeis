package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018428.
 * @author Sean A. Irvine
 */
public class A018428 extends FiniteSequence {

  /** Construct the sequence. */
  public A018428() {
    super(Cheetah.factor(388).divisorsSorted());
  }
}
