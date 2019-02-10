package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018776.
 * @author Sean A. Irvine
 */
public class A018776 extends FiniteSequence {

  /** Construct the sequence. */
  public A018776() {
    super(Cheetah.factor(1015).divisorsSorted());
  }
}
