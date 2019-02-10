package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018582.
 * @author Sean A. Irvine
 */
public class A018582 extends FiniteSequence {

  /** Construct the sequence. */
  public A018582() {
    super(Cheetah.factor(666).divisorsSorted());
  }
}
