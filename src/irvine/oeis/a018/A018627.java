package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018627 Divisors of 752.
 * @author Sean A. Irvine
 */
public class A018627 extends FiniteSequence {

  /** Construct the sequence. */
  public A018627() {
    super(Jaguar.factor(752).divisorsSorted());
  }
}
