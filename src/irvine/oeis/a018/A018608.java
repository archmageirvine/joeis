package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018608.
 * @author Sean A. Irvine
 */
public class A018608 extends FiniteSequence {

  /** Construct the sequence. */
  public A018608() {
    super(Cheetah.factor(716).divisorsSorted());
  }
}
