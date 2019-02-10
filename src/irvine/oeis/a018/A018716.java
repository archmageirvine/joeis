package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018716.
 * @author Sean A. Irvine
 */
public class A018716 extends FiniteSequence {

  /** Construct the sequence. */
  public A018716() {
    super(Cheetah.factor(909).divisorsSorted());
  }
}
