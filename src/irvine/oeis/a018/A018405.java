package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018405.
 * @author Sean A. Irvine
 */
public class A018405 extends FiniteSequence {

  /** Construct the sequence. */
  public A018405() {
    super(Cheetah.factor(348).divisorsSorted());
  }
}
