package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018604 Divisors of 711.
 * @author Sean A. Irvine
 */
public class A018604 extends FiniteSequence {

  /** Construct the sequence. */
  public A018604() {
    super(Jaguar.factor(711).divisorsSorted());
  }
}
