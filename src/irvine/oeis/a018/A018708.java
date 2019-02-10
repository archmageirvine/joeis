package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018708.
 * @author Sean A. Irvine
 */
public class A018708 extends FiniteSequence {

  /** Construct the sequence. */
  public A018708() {
    super(Cheetah.factor(896).divisorsSorted());
  }
}
