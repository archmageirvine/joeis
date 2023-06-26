package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018737 Divisors of 946.
 * @author Sean A. Irvine
 */
public class A018737 extends FiniteSequence {

  /** Construct the sequence. */
  public A018737() {
    super(1, FINITE, Jaguar.factor(946).divisorsSorted());
  }
}
