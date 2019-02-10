package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018302.
 * @author Sean A. Irvine
 */
public class A018302 extends FiniteSequence {

  /** Construct the sequence. */
  public A018302() {
    super(Cheetah.factor(144).divisorsSorted());
  }
}
