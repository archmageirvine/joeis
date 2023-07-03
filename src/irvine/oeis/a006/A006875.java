package irvine.oeis.a006;

import irvine.factor.factor.Jaguar;
import irvine.oeis.memory.MemoryFunction1Sequence;
import irvine.math.Mobius;
import irvine.math.z.Euler;
import irvine.math.z.Z;

/**
 * A006875 Non-seed mu-atoms of period n in Mandelbrot set.
 * @author Sean A. Irvine
 */
public class A006875 extends MemoryFunction1Sequence<Z> {

  private int mN = 0;

  @Override
  protected Z compute(final int n) {
    Z sum = Z.ZERO;
    for (final Z cc : Jaguar.factor(n).divisors()) {
      final int c = cc.intValueExact();
      sum = sum.add(Z.ONE.shiftLeft(c - 1).multiply(Mobius.mobius(n / c)));
    }
    return sum;
  }

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (final Z dd : Jaguar.factor(mN).divisors()) {
      final int d = dd.intValueExact();
      if (d < mN) {
        sum = sum.add(get(d).multiply(Euler.phiAsLong(mN / d)));
      }
    }
    return sum;
  }
}
