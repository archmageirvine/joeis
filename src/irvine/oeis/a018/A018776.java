package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018776 Divisors of 1015.
 * @author Sean A. Irvine
 */
public class A018776 extends FiniteSequence {

  /** Construct the sequence. */
  public A018776() {
    super(Jaguar.factor(1015).divisorsSorted());
  }
}
