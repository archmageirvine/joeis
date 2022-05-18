package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018462 Divisors of 450.
 * @author Sean A. Irvine
 */
public class A018462 extends FiniteSequence {

  /** Construct the sequence. */
  public A018462() {
    super(Jaguar.factor(450).divisorsSorted());
  }
}
