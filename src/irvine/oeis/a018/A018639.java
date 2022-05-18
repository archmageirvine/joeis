package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018639 Divisors of 775.
 * @author Sean A. Irvine
 */
public class A018639 extends FiniteSequence {

  /** Construct the sequence. */
  public A018639() {
    super(Jaguar.factor(775).divisorsSorted());
  }
}
