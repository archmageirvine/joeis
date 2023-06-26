package irvine.oeis.a119;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.FiniteSequence;

/**
 * A119988 Divisors of 69371610.
 * @author Sean A. Irvine
 */
public class A119988 extends FiniteSequence {

  /** Construct the sequence. */
  public A119988() {
    super(1, FINITE, Jaguar.factor(Z.valueOf(69371610L)).divisorsSorted());
  }
}
