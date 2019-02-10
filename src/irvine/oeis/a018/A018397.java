package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018397.
 * @author Sean A. Irvine
 */
public class A018397 extends FiniteSequence {

  /** Construct the sequence. */
  public A018397() {
    super(Cheetah.factor(332).divisorsSorted());
  }
}
