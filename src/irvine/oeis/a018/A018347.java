package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018347 Divisors of 234.
 * @author Sean A. Irvine
 */
public class A018347 extends FiniteSequence {

  /** Construct the sequence. */
  public A018347() {
    super(Jaguar.factor(234).divisorsSorted());
  }
}
