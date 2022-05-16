package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018380 Divisors of 296.
 * @author Sean A. Irvine
 */
public class A018380 extends FiniteSequence {

  /** Construct the sequence. */
  public A018380() {
    super(Jaguar.factor(296).divisorsSorted());
  }
}
