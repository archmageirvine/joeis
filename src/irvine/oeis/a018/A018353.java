package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018353.
 * @author Sean A. Irvine
 */
public class A018353 extends FiniteSequence {

  /** Construct the sequence. */
  public A018353() {
    super(Cheetah.factor(245).divisorsSorted());
  }
}
