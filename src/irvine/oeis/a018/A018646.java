package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018646 Divisors of 786.
 * @author Sean A. Irvine
 */
public class A018646 extends FiniteSequence {

  /** Construct the sequence. */
  public A018646() {
    super(1, FINITE, Jaguar.factor(786).divisorsSorted());
  }
}
