package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018307 Divisors of 153.
 * @author Sean A. Irvine
 */
public class A018307 extends FiniteSequence {

  /** Construct the sequence. */
  public A018307() {
    super(Jaguar.factor(153).divisorsSorted());
  }
}
