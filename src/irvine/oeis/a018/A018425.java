package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018425 Divisors of 384.
 * @author Sean A. Irvine
 */
public class A018425 extends FiniteSequence {

  /** Construct the sequence. */
  public A018425() {
    super(Jaguar.factor(384).divisorsSorted());
  }
}
