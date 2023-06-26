package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018715 Divisors of 908.
 * @author Sean A. Irvine
 */
public class A018715 extends FiniteSequence {

  /** Construct the sequence. */
  public A018715() {
    super(1, FINITE, Jaguar.factor(908).divisorsSorted());
  }
}
