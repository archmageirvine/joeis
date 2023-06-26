package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018662 Divisors of 816.
 * @author Sean A. Irvine
 */
public class A018662 extends FiniteSequence {

  /** Construct the sequence. */
  public A018662() {
    super(1, FINITE, Jaguar.factor(816).divisorsSorted());
  }
}
