package irvine.oeis.a394;

import irvine.oeis.Combiner;
import irvine.oeis.a000.A000203;
import irvine.oeis.a001.A001511;

/**
 * A394790 Product of the sum of divisors of n with the exponent of the highest power of 2 dividing 2n: a(n) = A000203(n)*A001511(n).
 * @author Sean A. Irvine
 */
public class A394790 extends Combiner {

  /** Construct the sequence. */
  public A394790() {
    super(1, new A000203(), new A001511(), MULTIPLY);
  }
}
