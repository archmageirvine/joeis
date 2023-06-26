package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018590 Divisors of 682.
 * @author Sean A. Irvine
 */
public class A018590 extends FiniteSequence {

  /** Construct the sequence. */
  public A018590() {
    super(1, FINITE, Jaguar.factor(682).divisorsSorted());
  }
}
