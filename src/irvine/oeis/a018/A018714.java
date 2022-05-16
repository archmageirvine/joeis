package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018714 Divisors of 906.
 * @author Sean A. Irvine
 */
public class A018714 extends FiniteSequence {

  /** Construct the sequence. */
  public A018714() {
    super(Jaguar.factor(906).divisorsSorted());
  }
}
