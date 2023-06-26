package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018563 Divisors of 638.
 * @author Sean A. Irvine
 */
public class A018563 extends FiniteSequence {

  /** Construct the sequence. */
  public A018563() {
    super(1, FINITE, Jaguar.factor(638).divisorsSorted());
  }
}
