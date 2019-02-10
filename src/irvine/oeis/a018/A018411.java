package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018411.
 * @author Sean A. Irvine
 */
public class A018411 extends FiniteSequence {

  /** Construct the sequence. */
  public A018411() {
    super(Cheetah.factor(357).divisorsSorted());
  }
}
