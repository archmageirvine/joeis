package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018487.
 * @author Sean A. Irvine
 */
public class A018487 extends FiniteSequence {

  /** Construct the sequence. */
  public A018487() {
    super(Cheetah.factor(496).divisorsSorted());
  }
}
