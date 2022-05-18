package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018541 Divisors of 600.
 * @author Sean A. Irvine
 */
public class A018541 extends FiniteSequence {

  /** Construct the sequence. */
  public A018541() {
    super(Jaguar.factor(600).divisorsSorted());
  }
}
