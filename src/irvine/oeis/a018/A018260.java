package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018260 Divisors of 45.
 * @author Sean A. Irvine
 */
public class A018260 extends FiniteSequence {

  /** Construct the sequence. */
  public A018260() {
    super(Jaguar.factor(45).divisorsSorted());
  }
}

