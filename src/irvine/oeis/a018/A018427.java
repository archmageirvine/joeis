package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018427 Divisors of 387.
 * @author Sean A. Irvine
 */
public class A018427 extends FiniteSequence {

  /** Construct the sequence. */
  public A018427() {
    super(Jaguar.factor(387).divisorsSorted());
  }
}
