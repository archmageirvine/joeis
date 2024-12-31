package irvine.oeis.a354;
// manually at 2024-12-29

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;

/**
 * A354112 Total number of 1&apos;s in binary expansion of all divisors of 2^n-1.
 * @author Georg Fischer
 */
public class A354112 extends AbstractSequence implements DirectSequence {

  private int mN;

  /** Construct the sequence. */
  public A354112() {
    super(1);
    mN = 0;
  }

  @Override
  public Z next() {
    return a(++mN);
  }

  @Override
  public Z a(final int n) {
    Z sum = Z.ZERO;
    final Z nz = Z.TWO.pow(n).subtract(1);
    for (final Z d : Jaguar.factor(nz).divisors()) {
      sum = sum.add(Functions.DIGIT_SUM.z(2, d));
    }
    return sum;
  }

  @Override
  public Z a(final Z n) {
    Z sum = Z.ZERO;
    final Z nz = Z.TWO.pow(n).subtract(1);
    for (final Z d : Jaguar.factor(nz).divisors()) {
      sum = sum.add(Functions.DIGIT_SUM.z(2, d));
    }
    return sum;
  }
}
