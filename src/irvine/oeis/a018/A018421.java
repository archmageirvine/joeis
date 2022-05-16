package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018421 Divisors of 375.
 * @author Sean A. Irvine
 */
public class A018421 extends FiniteSequence {

  /** Construct the sequence. */
  public A018421() {
    super(Jaguar.factor(375).divisorsSorted());
  }
}
