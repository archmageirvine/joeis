package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018435 Divisors of 404.
 * @author Sean A. Irvine
 */
public class A018435 extends FiniteSequence {

  /** Construct the sequence. */
  public A018435() {
    super(1, FINITE, Jaguar.factor(404).divisorsSorted());
  }
}
