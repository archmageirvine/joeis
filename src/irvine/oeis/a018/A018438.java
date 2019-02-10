package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018438.
 * @author Sean A. Irvine
 */
public class A018438 extends FiniteSequence {

  /** Construct the sequence. */
  public A018438() {
    super(Cheetah.factor(408).divisorsSorted());
  }
}
