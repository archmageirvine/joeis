package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018275 Divisors of 80.
 * @author Sean A. Irvine
 */
public class A018275 extends FiniteSequence {

  /** Construct the sequence. */
  public A018275() {
    super(Jaguar.factor(80).divisorsSorted());
  }
}
