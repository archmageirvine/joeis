package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018303 Divisors of 147.
 * @author Sean A. Irvine
 */
public class A018303 extends FiniteSequence {

  /** Construct the sequence. */
  public A018303() {
    super(Jaguar.factor(147).divisorsSorted());
  }
}
