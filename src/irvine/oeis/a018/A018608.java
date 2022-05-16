package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018608 Divisors of 716.
 * @author Sean A. Irvine
 */
public class A018608 extends FiniteSequence {

  /** Construct the sequence. */
  public A018608() {
    super(Jaguar.factor(716).divisorsSorted());
  }
}
