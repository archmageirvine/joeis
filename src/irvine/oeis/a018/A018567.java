package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018567 Divisors of 644.
 * @author Sean A. Irvine
 */
public class A018567 extends FiniteSequence {

  /** Construct the sequence. */
  public A018567() {
    super(1, FINITE, Jaguar.factor(644).divisorsSorted());
  }
}
