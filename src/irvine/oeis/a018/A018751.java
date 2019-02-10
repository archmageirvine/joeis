package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018751.
 * @author Sean A. Irvine
 */
public class A018751 extends FiniteSequence {

  /** Construct the sequence. */
  public A018751() {
    super(Cheetah.factor(970).divisorsSorted());
  }
}
