package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018618 Divisors of 736.
 * @author Sean A. Irvine
 */
public class A018618 extends FiniteSequence {

  /** Construct the sequence. */
  public A018618() {
    super(1, FINITE, Jaguar.factor(736).divisorsSorted());
  }
}
