package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018330 Divisors of 196.
 * @author Sean A. Irvine
 */
public class A018330 extends FiniteSequence {

  /** Construct the sequence. */
  public A018330() {
    super(1, FINITE, Jaguar.factor(196).divisorsSorted());
  }
}
