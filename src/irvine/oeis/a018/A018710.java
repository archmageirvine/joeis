package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018710 Divisors of 900.
 * @author Sean A. Irvine
 */
public class A018710 extends FiniteSequence {

  /** Construct the sequence. */
  public A018710() {
    super(Jaguar.factor(900).divisorsSorted());
  }
}
