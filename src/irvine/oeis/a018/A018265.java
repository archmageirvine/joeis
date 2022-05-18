package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018265 Divisors of 56.
 * @author Sean A. Irvine
 */
public class A018265 extends FiniteSequence {

  /** Construct the sequence. */
  public A018265() {
    super(Jaguar.factor(56).divisorsSorted());
  }
}

