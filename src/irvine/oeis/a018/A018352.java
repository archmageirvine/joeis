package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018352 Divisors of 244.
 * @author Sean A. Irvine
 */
public class A018352 extends FiniteSequence {

  /** Construct the sequence. */
  public A018352() {
    super(1, FINITE, Jaguar.factor(244).divisorsSorted());
  }
}
