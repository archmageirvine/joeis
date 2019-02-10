package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018725.
 * @author Sean A. Irvine
 */
public class A018725 extends FiniteSequence {

  /** Construct the sequence. */
  public A018725() {
    super(Cheetah.factor(927).divisorsSorted());
  }
}
