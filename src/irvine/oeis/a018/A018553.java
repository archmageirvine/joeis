package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018553 Divisors of 618.
 * @author Sean A. Irvine
 */
public class A018553 extends FiniteSequence {

  /** Construct the sequence. */
  public A018553() {
    super(Jaguar.factor(618).divisorsSorted());
  }
}
