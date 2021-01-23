package irvine.oeis.a037;

import irvine.factor.factor.Cheetah;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;
import irvine.util.array.DynamicLongArray;

/**
 * A037950 Primes at which cusp form Delta_20 is not ordinary.
 * @author Sean A. Irvine
 */
public class A037950 extends A000040 {

  private final DynamicLongArray mSigma = new DynamicLongArray();

  private long sigma(final int n) {
    while (n >= mSigma.length()) {
      mSigma.set(mSigma.length(), Cheetah.factor(mSigma.length()).sigma().longValueExact());
    }
    return mSigma.get(n);
  }


  private long tau20(final int n) {
    long sum = 0;
    for (int k = 1; k < n; ++k) {
      long t = LongUtils.modPow(k, 8, n);
      t *= sigma(k);
      t %= n;
      t *= sigma(n - k);
      t %= n;
      sum += t;
      sum %= n;
    }
    return (sum * -67320) % n;
  }

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (tau20(p.intValueExact()) == 0) {
        return p;
      }
    }
  }
}


