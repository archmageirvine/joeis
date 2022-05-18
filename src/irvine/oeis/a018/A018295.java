package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018295 Divisors of 126.
 * @author Sean A. Irvine
 */
public class A018295 extends FiniteSequence {

  /** Construct the sequence. */
  public A018295() {
    super(Jaguar.factor(126).divisorsSorted());
  }
}
