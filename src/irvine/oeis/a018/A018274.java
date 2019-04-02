package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018274 Divisors of 78.
 * @author Sean A. Irvine
 */
public class A018274 extends FiniteSequence {

  /** Construct the sequence. */
  public A018274() {
    super(Cheetah.factor(78).divisorsSorted());
  }
}
