package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018664.
 * @author Sean A. Irvine
 */
public class A018664 extends FiniteSequence {

  /** Construct the sequence. */
  public A018664() {
    super(Cheetah.factor(820).divisorsSorted());
  }
}
