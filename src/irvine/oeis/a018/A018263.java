package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018263.
 * @author Sean A. Irvine
 */
public class A018263 extends FiniteSequence {

  /** Construct the sequence. */
  public A018263() {
    super(Cheetah.factor(52).divisorsSorted());
  }
}

