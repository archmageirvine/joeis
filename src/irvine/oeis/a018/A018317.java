package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018317 Divisors of 172.
 * @author Sean A. Irvine
 */
public class A018317 extends FiniteSequence {

  /** Construct the sequence. */
  public A018317() {
    super(1, FINITE, Jaguar.factor(172).divisorsSorted());
  }
}
