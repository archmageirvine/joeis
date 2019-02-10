package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018574.
 * @author Sean A. Irvine
 */
public class A018574 extends FiniteSequence {

  /** Construct the sequence. */
  public A018574() {
    super(Cheetah.factor(654).divisorsSorted());
  }
}
