package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018424 Divisors of 380.
 * @author Sean A. Irvine
 */
public class A018424 extends FiniteSequence {

  /** Construct the sequence. */
  public A018424() {
    super(Cheetah.factor(380).divisorsSorted());
  }
}
