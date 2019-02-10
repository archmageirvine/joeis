package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018348.
 * @author Sean A. Irvine
 */
public class A018348 extends FiniteSequence {

  /** Construct the sequence. */
  public A018348() {
    super(Cheetah.factor(236).divisorsSorted());
  }
}
