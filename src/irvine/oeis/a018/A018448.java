package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018448.
 * @author Sean A. Irvine
 */
public class A018448 extends FiniteSequence {

  /** Construct the sequence. */
  public A018448() {
    super(Cheetah.factor(426).divisorsSorted());
  }
}
