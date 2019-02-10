package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018553.
 * @author Sean A. Irvine
 */
public class A018553 extends FiniteSequence {

  /** Construct the sequence. */
  public A018553() {
    super(Cheetah.factor(618).divisorsSorted());
  }
}
