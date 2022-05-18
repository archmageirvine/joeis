package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018278 Divisors of 90.
 * @author Sean A. Irvine
 */
public class A018278 extends FiniteSequence {

  /** Construct the sequence. */
  public A018278() {
    super(Jaguar.factor(90).divisorsSorted());
  }
}
