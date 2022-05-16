package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018280 Divisors of 96.
 * @author Sean A. Irvine
 */
public class A018280 extends FiniteSequence {

  /** Construct the sequence. */
  public A018280() {
    super(Jaguar.factor(96).divisorsSorted());
  }
}
