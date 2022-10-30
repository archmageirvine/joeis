package irvine.oeis.a037;

import irvine.factor.factor.Jaguar;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;
import irvine.util.array.DynamicLongArray;

/**
 * A037949 Primes at which cusp form Delta_16 is not ordinary.
 * @author Sean A. Irvine
 */
public class A037949 extends A000040 {

  {
    setOffset(0);
  }

//  private final MemorySequence mSigma = MemorySequence.cachedSequence(new PrependSequence(new A000203(), 0));
//
//  private Z tau16(final Z n) {
//    Z sum = Z.ZERO;
//    final int nn = n.intValueExact();
//    for (int k = 1; k < nn; ++k) {
//      sum = sum.add(Z.valueOf(k).modPow(Z.SIX, n).modMultiply(mSigma.a(k), n).modMultiply(mSigma.a(nn - k), n));
//      sum = sum.mod(n);
//    }
//    return sum.multiply(-6552).mod(n);
//  }

  private final DynamicLongArray mSigma = new DynamicLongArray();

  private long sigma(final int n) {
    while (n >= mSigma.length()) {
      mSigma.set(mSigma.length(), Jaguar.factor(mSigma.length()).sigma().longValueExact());
    }
    return mSigma.get(n);
  }


  private long tau16(final int n) {
    long sum = 0;
    for (int k = 1; k < n; ++k) {
      long t = LongUtils.modPow(k, 6, n);
      t *= sigma(k);
      t %= n;
      t *= sigma(n - k);
      t %= n;
      sum += t;
      sum %= n;
    }
    return (sum * -6552) % n;
  }

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (tau16(p.intValueExact()) == 0) {
        return p;
      }
//      if (Z.ZERO.equals(tau16(p))) {
//        return p;
//      }
    }
  }
}


