package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018570 Divisors of 648.
 * @author Sean A. Irvine
 */
public class A018570 extends FiniteSequence {

  /** Construct the sequence. */
  public A018570() {
    super(1, FINITE, Jaguar.factor(648).divisorsSorted());
  }
}
