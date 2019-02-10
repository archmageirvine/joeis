package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018637.
 * @author Sean A. Irvine
 */
public class A018637 extends FiniteSequence {

  /** Construct the sequence. */
  public A018637() {
    super(Cheetah.factor(772).divisorsSorted());
  }
}
