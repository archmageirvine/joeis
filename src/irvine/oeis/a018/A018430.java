package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018430.
 * @author Sean A. Irvine
 */
public class A018430 extends FiniteSequence {

  /** Construct the sequence. */
  public A018430() {
    super(Cheetah.factor(392).divisorsSorted());
  }
}
