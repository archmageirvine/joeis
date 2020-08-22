package irvine.oeis.a006;

import irvine.factor.factor.Cheetah;
import irvine.math.LongUtils;
import irvine.math.MemoryFunction1;
import irvine.math.z.Z;
import irvine.math.Mobius;
import irvine.oeis.Sequence;

/**
 * A006875 Non-seed mu-atoms of period n in Mandelbrot set.
 * @author Sean A. Irvine
 */
public class A006875 extends MemoryFunction1<Z> implements Sequence {

  private int mN = 0;

  @Override
  protected Z compute(final int n) {
    Z sum = Z.ZERO;
    for (final Z cc : Cheetah.factor(n).divisors()) {
      final int c = cc.intValueExact();
      sum = sum.add(Z.ONE.shiftLeft(c - 1).multiply(Mobius.mobius(n / c)));
    }
    return sum;
  }

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (final Z dd : Cheetah.factor(mN).divisors()) {
      final int d = dd.intValueExact();
      if (d < mN) {
        sum = sum.add(get(d).multiply(LongUtils.phi(mN / d)));
      }
    }
    return sum;
  }
}
