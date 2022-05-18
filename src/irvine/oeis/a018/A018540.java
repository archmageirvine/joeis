package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018540 Divisors of 598.
 * @author Sean A. Irvine
 */
public class A018540 extends FiniteSequence {

  /** Construct the sequence. */
  public A018540() {
    super(Jaguar.factor(598).divisorsSorted());
  }
}
