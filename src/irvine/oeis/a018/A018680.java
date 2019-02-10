package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018680.
 * @author Sean A. Irvine
 */
public class A018680 extends FiniteSequence {

  /** Construct the sequence. */
  public A018680() {
    super(Cheetah.factor(847).divisorsSorted());
  }
}
