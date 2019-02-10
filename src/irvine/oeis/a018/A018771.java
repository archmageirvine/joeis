package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018771.
 * @author Sean A. Irvine
 */
public class A018771 extends FiniteSequence {

  /** Construct the sequence. */
  public A018771() {
    super(Cheetah.factor(1005).divisorsSorted());
  }
}
