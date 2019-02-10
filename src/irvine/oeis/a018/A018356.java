package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018356.
 * @author Sean A. Irvine
 */
public class A018356 extends FiniteSequence {

  /** Construct the sequence. */
  public A018356() {
    super(Cheetah.factor(250).divisorsSorted());
  }
}
