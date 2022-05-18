package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018767 Divisors of 1000.
 * @author Sean A. Irvine
 */
public class A018767 extends FiniteSequence {

  /** Construct the sequence. */
  public A018767() {
    super(Jaguar.factor(1000).divisorsSorted());
  }
}
