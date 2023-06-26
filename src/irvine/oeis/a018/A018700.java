package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018700 Divisors of 882.
 * @author Sean A. Irvine
 */
public class A018700 extends FiniteSequence {

  /** Construct the sequence. */
  public A018700() {
    super(1, FINITE, Jaguar.factor(882).divisorsSorted());
  }
}
