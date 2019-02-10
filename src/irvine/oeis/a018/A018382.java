package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018382.
 * @author Sean A. Irvine
 */
public class A018382 extends FiniteSequence {

  /** Construct the sequence. */
  public A018382() {
    super(Cheetah.factor(300).divisorsSorted());
  }
}
