package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018410.
 * @author Sean A. Irvine
 */
public class A018410 extends FiniteSequence {

  /** Construct the sequence. */
  public A018410() {
    super(Cheetah.factor(356).divisorsSorted());
  }
}
