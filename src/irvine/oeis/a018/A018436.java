package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018436 Divisors of 405.
 * @author Sean A. Irvine
 */
public class A018436 extends FiniteSequence {

  /** Construct the sequence. */
  public A018436() {
    super(1, FINITE, Jaguar.factor(405).divisorsSorted());
  }
}
