package irvine.oeis.a000;

import java.util.ArrayList;
import java.util.HashMap;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.LongUtils;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000233 Generalized class numbers.
 * @author Sean A. Irvine
 */
public class A000233 implements Sequence {

  protected int mT = 0;
  private final HashMap<String, Z> mCache = new HashMap<>();

  private Z bigCbn(final long b, final long n) {
    Z sum = Z.ZERO;
    if ((b & 3) == 3) {
      for (long k = 1; k <= (b - 1) / 2; ++k) {
        sum = sum.add(Z.valueOf(b - 4 * k).pow(2 * n).multiply(LongUtils.jacobi(k, b)));
      }
    } else {
      long k = 1;
      while (k < b) {
        sum = sum.add(Z.valueOf(b - k).pow(2 * n).multiply(LongUtils.jacobi(-b, k)));
        k += 2;
      }
    }
    return (n & 1) == 0 ? sum : sum.negate();
  }

  private Z[] handleFactors(final long a, final long n) {
    Z mz = Z.ONE;
    Z bz = Z.ONE;
    final FactorSequence fs = Cheetah.factor(a);
    final ArrayList<Z> p = new ArrayList<>();
    for (final Z f : fs.toZArray()) {
      final long e = fs.getExponent(f);
      if ((e & 1) == 1) {
        bz = bz.multiply(f);
        if ((e - 1) / 2 > 0) {
          mz = mz.multiply(f.pow((e - 1) / 2));
          p.add(f);
        }
      } else {
        mz = mz.multiply(f.pow(e / 2));
        p.add(f);
      }
    }
    Z prod2 = Z.ONE;
    final long b = bz.longValue();
    long prod1 = mz.longValue();
    for (final Z piz : p) {
      final long pi = piz.longValue();
      if ((pi & 1) == 1) {
        prod1 /= pi;
        prod2 = prod2.multiply(piz.pow(2L * n + 1).subtract(LongUtils.jacobi(-b, pi)));
      }
    }
    final Z r = prod2.multiply(Z.valueOf(prod1).pow(2 * n + 1)).multiply(mz.pow(2 * n));
    return new Z[] {bz, b == 1 && a != 1 ? r.divide(2) : r};
  }

  private Z uncachedCbn(final long b, final int n) {
    if (b == 1 && n <= 1) {
      return Z.ONE;
    }
    Z r = bigCbn(b, n);
    for (int i = 1; i <= n; ++i) {
      r = r.subtract(cbn(b, n - i).multiply(Z.valueOf(b * b).negate().pow(i))
                     .multiply(Binomial.binomial(2L * n, 2 * i)));
    }
    return r;
  }

  private Z cbn(final long b, final int n) {
    final String key = b + "_" + n;
    Z r = mCache.get(key);
    if (r != null) {
      return r;
    }
    r = uncachedCbn(b, n);
    mCache.put(key, r);
    return r;
  }

  private Z can(final long a, final int n) {
    final String key = a + "_" + n;
    Z r = mCache.get(key);
    if (r != null) {
      return r;
    }
    // Handle a=bm^2
    final Z[] sf = handleFactors(a, n);
    final long b = sf[0].longValue();
    r = a == b ? uncachedCbn(b, n) : cbn(b, n);
    r = r.multiply(sf[1]);
    mCache.put(key, r);
    return r;
  }

  protected int getN() {
    return 1;
  }

  protected int getA() {
    return ++mT;
  }

  @Override
  public Z next() {
    return can(getA(), getN());
  }
}
