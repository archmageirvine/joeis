package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018458 Divisors of 441.
 * @author Sean A. Irvine
 */
public class A018458 extends FiniteSequence {

  /** Construct the sequence. */
  public A018458() {
    super(Jaguar.factor(441).divisorsSorted());
  }
}
