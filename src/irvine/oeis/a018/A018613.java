package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018613 Divisors of 726.
 * @author Sean A. Irvine
 */
public class A018613 extends FiniteSequence {

  /** Construct the sequence. */
  public A018613() {
    super(Jaguar.factor(726).divisorsSorted());
  }
}
