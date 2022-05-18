package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018355 Divisors of 248.
 * @author Sean A. Irvine
 */
public class A018355 extends FiniteSequence {

  /** Construct the sequence. */
  public A018355() {
    super(Jaguar.factor(248).divisorsSorted());
  }
}
