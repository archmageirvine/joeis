package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018542 Divisors of 602.
 * @author Sean A. Irvine
 */
public class A018542 extends FiniteSequence {

  /** Construct the sequence. */
  public A018542() {
    super(Jaguar.factor(602).divisorsSorted());
  }
}
