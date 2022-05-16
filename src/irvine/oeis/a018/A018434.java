package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018434 Divisors of 402.
 * @author Sean A. Irvine
 */
public class A018434 extends FiniteSequence {

  /** Construct the sequence. */
  public A018434() {
    super(Jaguar.factor(402).divisorsSorted());
  }
}
