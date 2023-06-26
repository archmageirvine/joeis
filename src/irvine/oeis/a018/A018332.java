package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018332 Divisors of 200.
 * @author Sean A. Irvine
 */
public class A018332 extends FiniteSequence {

  /** Construct the sequence. */
  public A018332() {
    super(1, FINITE, Jaguar.factor(200).divisorsSorted());
  }
}
