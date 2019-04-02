package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018443 Divisors of 418.
 * @author Sean A. Irvine
 */
public class A018443 extends FiniteSequence {

  /** Construct the sequence. */
  public A018443() {
    super(Cheetah.factor(418).divisorsSorted());
  }
}
