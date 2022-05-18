package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018612 Divisors of 725.
 * @author Sean A. Irvine
 */
public class A018612 extends FiniteSequence {

  /** Construct the sequence. */
  public A018612() {
    super(Jaguar.factor(725).divisorsSorted());
  }
}
