package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018566 Divisors of 642.
 * @author Sean A. Irvine
 */
public class A018566 extends FiniteSequence {

  /** Construct the sequence. */
  public A018566() {
    super(Jaguar.factor(642).divisorsSorted());
  }
}
