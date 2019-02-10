package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018736.
 * @author Sean A. Irvine
 */
public class A018736 extends FiniteSequence {

  /** Construct the sequence. */
  public A018736() {
    super(Cheetah.factor(945).divisorsSorted());
  }
}
