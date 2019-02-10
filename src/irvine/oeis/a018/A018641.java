package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018641.
 * @author Sean A. Irvine
 */
public class A018641 extends FiniteSequence {

  /** Construct the sequence. */
  public A018641() {
    super(Cheetah.factor(777).divisorsSorted());
  }
}
