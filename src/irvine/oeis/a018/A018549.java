package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018549 Divisors of 610.
 * @author Sean A. Irvine
 */
public class A018549 extends FiniteSequence {

  /** Construct the sequence. */
  public A018549() {
    super(Jaguar.factor(610).divisorsSorted());
  }
}
