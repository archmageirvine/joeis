package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018697 Divisors of 875.
 * @author Sean A. Irvine
 */
public class A018697 extends FiniteSequence {

  /** Construct the sequence. */
  public A018697() {
    super(Jaguar.factor(875).divisorsSorted());
  }
}
