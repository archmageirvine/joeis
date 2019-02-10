package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018738.
 * @author Sean A. Irvine
 */
public class A018738 extends FiniteSequence {

  /** Construct the sequence. */
  public A018738() {
    super(Cheetah.factor(948).divisorsSorted());
  }
}
