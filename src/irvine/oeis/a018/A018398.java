package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018398.
 * @author Sean A. Irvine
 */
public class A018398 extends FiniteSequence {

  /** Construct the sequence. */
  public A018398() {
    super(Cheetah.factor(333).divisorsSorted());
  }
}
