package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018731 Divisors of 936.
 * @author Sean A. Irvine
 */
public class A018731 extends FiniteSequence {

  /** Construct the sequence. */
  public A018731() {
    super(1, FINITE, Jaguar.factor(936).divisorsSorted());
  }
}
