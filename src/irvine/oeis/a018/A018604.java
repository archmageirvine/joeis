package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018604.
 * @author Sean A. Irvine
 */
public class A018604 extends FiniteSequence {

  /** Construct the sequence. */
  public A018604() {
    super(Cheetah.factor(711).divisorsSorted());
  }
}
