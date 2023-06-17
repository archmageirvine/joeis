package irvine.oeis.a000;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A000939 Number of inequivalent n-gons.
 * @author Sean A. Irvine
 */
public class A000939 extends AbstractSequence {

  /** Construct the sequence. */
  public A000939() {
    super(1);
  }

  private int mN = 0;
  private final MemoryFactorial mF = MemoryFactorial.SINGLETON;

  private Z sum(final Z initial) {
    Z t = initial;
    for (int d = 1; d <= mN; ++d) {
      if (mN % d == 0) {
        final Z r = Z.valueOf(mN / d);
        t = t.add(Euler.phi(r).square().multiply(mF.factorial(d)).multiply(r.pow(d)));
      }
    }
    return t.divide(2L * mN * mN);
  }

  private Z even() {
    final int m = mN / 2;
    return sum(mF.factorial(m).multiply(m).shiftLeft(m));
  }

  private Z odd() {
    return sum(Z.ZERO);
  }

  @Override
  public Z next() {
    if (++mN < 3) {
      return Z.ONE;
    }
    return (mN & 1) == 0 ? even() : odd();
  }
}

