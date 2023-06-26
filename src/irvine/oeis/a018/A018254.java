package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018254 Divisors of 28.
 * @author Sean A. Irvine
 */
public class A018254 extends FiniteSequence {

  /** Construct the sequence. */
  public A018254() {
    super(1, FINITE, Jaguar.factor(28).divisorsSorted());
  }
}

