package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018498.
 * @author Sean A. Irvine
 */
public class A018498 extends FiniteSequence {

  /** Construct the sequence. */
  public A018498() {
    super(Cheetah.factor(520).divisorsSorted());
  }
}
