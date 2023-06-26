package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018412 Divisors of 360.
 * @author Sean A. Irvine
 */
public class A018412 extends FiniteSequence {

  /** Construct the sequence. */
  public A018412() {
    super(1, FINITE, Jaguar.factor(360).divisorsSorted());
  }
}
