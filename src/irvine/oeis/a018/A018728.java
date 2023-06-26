package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018728 Divisors of 931.
 * @author Sean A. Irvine
 */
public class A018728 extends FiniteSequence {

  /** Construct the sequence. */
  public A018728() {
    super(1, FINITE, Jaguar.factor(931).divisorsSorted());
  }
}
