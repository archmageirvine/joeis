package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018520.
 * @author Sean A. Irvine
 */
public class A018520 extends FiniteSequence {

  /** Construct the sequence. */
  public A018520() {
    super(Cheetah.factor(561).divisorsSorted());
  }
}
