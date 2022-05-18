package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018695 Divisors of 873.
 * @author Sean A. Irvine
 */
public class A018695 extends FiniteSequence {

  /** Construct the sequence. */
  public A018695() {
    super(Jaguar.factor(873).divisorsSorted());
  }
}
