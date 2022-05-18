package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018505 Divisors of 532.
 * @author Sean A. Irvine
 */
public class A018505 extends FiniteSequence {

  /** Construct the sequence. */
  public A018505() {
    super(Jaguar.factor(532).divisorsSorted());
  }
}
