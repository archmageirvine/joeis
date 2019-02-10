package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018772.
 * @author Sean A. Irvine
 */
public class A018772 extends FiniteSequence {

  /** Construct the sequence. */
  public A018772() {
    super(Cheetah.factor(1008).divisorsSorted());
  }
}
