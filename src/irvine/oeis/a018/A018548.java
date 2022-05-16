package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018548 Divisors of 609.
 * @author Sean A. Irvine
 */
public class A018548 extends FiniteSequence {

  /** Construct the sequence. */
  public A018548() {
    super(Jaguar.factor(609).divisorsSorted());
  }
}
