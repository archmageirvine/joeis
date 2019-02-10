package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018675.
 * @author Sean A. Irvine
 */
public class A018675 extends FiniteSequence {

  /** Construct the sequence. */
  public A018675() {
    super(Cheetah.factor(837).divisorsSorted());
  }
}
