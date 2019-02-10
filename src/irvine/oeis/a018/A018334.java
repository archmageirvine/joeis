package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018334.
 * @author Sean A. Irvine
 */
public class A018334 extends FiniteSequence {

  /** Construct the sequence. */
  public A018334() {
    super(Cheetah.factor(207).divisorsSorted());
  }
}
