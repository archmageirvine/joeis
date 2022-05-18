package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018312 Divisors of 164.
 * @author Sean A. Irvine
 */
public class A018312 extends FiniteSequence {

  /** Construct the sequence. */
  public A018312() {
    super(Jaguar.factor(164).divisorsSorted());
  }
}
