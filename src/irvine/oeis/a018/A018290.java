package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018290.
 * @author Sean A. Irvine
 */
public class A018290 extends FiniteSequence {

  /** Construct the sequence. */
  public A018290() {
    super(Cheetah.factor(114).divisorsSorted());
  }
}
