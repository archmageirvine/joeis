package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018547.
 * @author Sean A. Irvine
 */
public class A018547 extends FiniteSequence {

  /** Construct the sequence. */
  public A018547() {
    super(Cheetah.factor(608).divisorsSorted());
  }
}
