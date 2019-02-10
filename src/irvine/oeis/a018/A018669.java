package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018669.
 * @author Sean A. Irvine
 */
public class A018669 extends FiniteSequence {

  /** Construct the sequence. */
  public A018669() {
    super(Cheetah.factor(828).divisorsSorted());
  }
}
