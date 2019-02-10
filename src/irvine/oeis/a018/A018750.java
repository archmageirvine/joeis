package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018750.
 * @author Sean A. Irvine
 */
public class A018750 extends FiniteSequence {

  /** Construct the sequence. */
  public A018750() {
    super(Cheetah.factor(969).divisorsSorted());
  }
}
