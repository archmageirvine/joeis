package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018515.
 * @author Sean A. Irvine
 */
public class A018515 extends FiniteSequence {

  /** Construct the sequence. */
  public A018515() {
    super(Cheetah.factor(552).divisorsSorted());
  }
}
