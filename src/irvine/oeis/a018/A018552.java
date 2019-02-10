package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018552.
 * @author Sean A. Irvine
 */
public class A018552 extends FiniteSequence {

  /** Construct the sequence. */
  public A018552() {
    super(Cheetah.factor(616).divisorsSorted());
  }
}
