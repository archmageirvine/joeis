package irvine.oeis.a000;

import irvine.factor.factor.Jaguar;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicArray;

/**
 * A000087 Number of unrooted nonseparable planar maps with n edges and a distinguished face.
 * @author Sean A. Irvine
 */
public class A000087 extends Sequence1 {

  private long mN = 0;
  private final LongDynamicArray<Z> mBinomial3 = new LongDynamicArray<>();
  {
    mBinomial3.set(1, Z.THREE);
  }

  private Z binomial3(final long n) {
    long len = mBinomial3.length();
    if (n < len) {
      return mBinomial3.get(n);
    }
    Z b = mBinomial3.get(len - 1);
    while (n >= len) {
      final long tn = 3 * len - 1;
      b = b.multiply(3)
        .multiply(tn)
        .multiply(tn - 1)
        .divide2()
        .divide(2 * len - 1)
        .divide(len);
      mBinomial3.set(len++, b);
    }
    return b;
  }

  @Override
  public Z next() {
    ++mN;
    Z r = Z.valueOf(mN + 2).multiply(binomial3(mN)).multiply(3 * mN + 1);
    if ((mN & 1) == 1) {
      r = r.add(binomial3((mN + 1) / 2).multiply(2 * mN).multiply(mN + 1).multiply(3 * mN - 2));
    }
    r = r.divide(3 * mN + 1).divide(3 * mN - 1).divide(3 * mN - 2);
    for (final Z d : Jaguar.factor(mN).divisors()) {
      final long dd = d.longValue();
      if (dd != mN && dd != 1) {
        r = r.add(binomial3(dd).multiply(LongUtils.phi(mN / dd)));
      }
    }
    // trivial divisor
    if (mN > 1) {
      r = r.add(Z.THREE.multiply(LongUtils.phi(mN)));
    }
    return r.divide(3 * mN);
  }

}

