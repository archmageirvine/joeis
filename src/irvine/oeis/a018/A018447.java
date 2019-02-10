package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018447.
 * @author Sean A. Irvine
 */
public class A018447 extends FiniteSequence {

  /** Construct the sequence. */
  public A018447() {
    super(Cheetah.factor(425).divisorsSorted());
  }
}
