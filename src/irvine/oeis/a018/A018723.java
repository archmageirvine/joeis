package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018723 Divisors of 924.
 * @author Sean A. Irvine
 */
public class A018723 extends FiniteSequence {

  /** Construct the sequence. */
  public A018723() {
    super(Jaguar.factor(924).divisorsSorted());
  }
}
