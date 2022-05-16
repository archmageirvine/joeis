package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018680 Divisors of 847.
 * @author Sean A. Irvine
 */
public class A018680 extends FiniteSequence {

  /** Construct the sequence. */
  public A018680() {
    super(Jaguar.factor(847).divisorsSorted());
  }
}
