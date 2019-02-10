package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018769.
 * @author Sean A. Irvine
 */
public class A018769 extends FiniteSequence {

  /** Construct the sequence. */
  public A018769() {
    super(Cheetah.factor(1002).divisorsSorted());
  }
}
