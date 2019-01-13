package irvine.oeis.a003;

import java.util.Arrays;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.FiniteSequence;

/**
 * A003529.
 * @author Sean A. Irvine
 */
public class A003529 extends FiniteSequence {

  static Z[] divisors(final int n) {
    final Z[] divisors = Jaguar.factor(Z.valueOf((1L << n) - 1)).divisors();
    Arrays.sort(divisors);
    return divisors;
  }

  /** Construct the sequence. */
  public A003529() {
    super(divisors(20));
  }
}

