package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018703.
 * @author Sean A. Irvine
 */
public class A018703 extends FiniteSequence {

  /** Construct the sequence. */
  public A018703() {
    super(Cheetah.factor(888).divisorsSorted());
  }
}
