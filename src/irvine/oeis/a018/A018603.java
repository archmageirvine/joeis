package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018603 Divisors of 710.
 * @author Sean A. Irvine
 */
public class A018603 extends FiniteSequence {

  /** Construct the sequence. */
  public A018603() {
    super(Jaguar.factor(710).divisorsSorted());
  }
}
