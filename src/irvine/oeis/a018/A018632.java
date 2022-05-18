package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018632 Divisors of 762.
 * @author Sean A. Irvine
 */
public class A018632 extends FiniteSequence {

  /** Construct the sequence. */
  public A018632() {
    super(Jaguar.factor(762).divisorsSorted());
  }
}
