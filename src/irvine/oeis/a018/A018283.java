package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018283.
 * @author Sean A. Irvine
 */
public class A018283 extends FiniteSequence {

  /** Construct the sequence. */
  public A018283() {
    super(Cheetah.factor(100).divisorsSorted());
  }
}
