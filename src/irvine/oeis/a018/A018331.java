package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018331.
 * @author Sean A. Irvine
 */
public class A018331 extends FiniteSequence {

  /** Construct the sequence. */
  public A018331() {
    super(Cheetah.factor(198).divisorsSorted());
  }
}
