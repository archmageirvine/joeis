package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018572.
 * @author Sean A. Irvine
 */
public class A018572 extends FiniteSequence {

  /** Construct the sequence. */
  public A018572() {
    super(Cheetah.factor(651).divisorsSorted());
  }
}
