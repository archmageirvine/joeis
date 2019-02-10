package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018633.
 * @author Sean A. Irvine
 */
public class A018633 extends FiniteSequence {

  /** Construct the sequence. */
  public A018633() {
    super(Cheetah.factor(764).divisorsSorted());
  }
}
