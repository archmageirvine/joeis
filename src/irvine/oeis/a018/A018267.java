package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018267.
 * @author Sean A. Irvine
 */
public class A018267 extends FiniteSequence {

  /** Construct the sequence. */
  public A018267() {
    super(Cheetah.factor(63).divisorsSorted());
  }
}

