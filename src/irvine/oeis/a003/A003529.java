package irvine.oeis.a003;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.FiniteSequence;

/**
 * A003529 Divisors of 2^20 - 1.
 * @author Sean A. Irvine
 */
public class A003529 extends FiniteSequence {

  static Z[] divisors(final int n) {
    return Jaguar.factor(Z.valueOf((1L << n) - 1)).divisorsSorted();
  }

  /** Construct the sequence. */
  public A003529() {
    super(divisors(20));
  }
}

