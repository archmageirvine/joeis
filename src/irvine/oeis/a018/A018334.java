package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018334 Divisors of 207.
 * @author Sean A. Irvine
 */
public class A018334 extends FiniteSequence {

  /** Construct the sequence. */
  public A018334() {
    super(Jaguar.factor(207).divisorsSorted());
  }
}
