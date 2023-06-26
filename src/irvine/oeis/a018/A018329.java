package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018329 Divisors of 195.
 * @author Sean A. Irvine
 */
public class A018329 extends FiniteSequence {

  /** Construct the sequence. */
  public A018329() {
    super(1, FINITE, Jaguar.factor(195).divisorsSorted());
  }
}
