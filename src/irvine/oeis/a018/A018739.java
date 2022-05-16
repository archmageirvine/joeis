package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018739 Divisors of 950.
 * @author Sean A. Irvine
 */
public class A018739 extends FiniteSequence {

  /** Construct the sequence. */
  public A018739() {
    super(Jaguar.factor(950).divisorsSorted());
  }
}
