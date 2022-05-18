package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018508 Divisors of 539.
 * @author Sean A. Irvine
 */
public class A018508 extends FiniteSequence {

  /** Construct the sequence. */
  public A018508() {
    super(Jaguar.factor(539).divisorsSorted());
  }
}
