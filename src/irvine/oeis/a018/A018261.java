package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018261 Divisors of 48.
 * @author Sean A. Irvine
 */
public class A018261 extends FiniteSequence {

  /** Construct the sequence. */
  public A018261() {
    super(Jaguar.factor(48).divisorsSorted());
  }
}

