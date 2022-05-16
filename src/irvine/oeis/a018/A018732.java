package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018732 Divisors of 938.
 * @author Sean A. Irvine
 */
public class A018732 extends FiniteSequence {

  /** Construct the sequence. */
  public A018732() {
    super(Jaguar.factor(938).divisorsSorted());
  }
}
