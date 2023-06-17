package irvine.oeis.a000;

import java.util.ArrayList;
import java.util.HashMap;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.LongUtils;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A000061 Generalized tangent numbers d(n,1).
 * @author Sean A. Irvine
 */
public class A000061 extends AbstractSequence {

  /** Construct the sequence. */
  public A000061() {
    super(1);
  }

  protected int mT = 0;
  private final HashMap<String, Z> mCache = new HashMap<>();

  private Z bigDbn(final long b, final long n) {
    if (b == 1) {
      return (n & 1) == 0 ? Z.NEG_ONE : Z.ONE;
    }
    Z sum = Z.ZERO;
    if ((b & 3) == 1) {
      for (long k = 1; k <= (b - 1) / 2; ++k) {
        sum = sum.add(Z.valueOf(b - 4 * k).pow(2 * n - 1).multiply(LongUtils.jacobi(k, b)));
      }
    } else {
      long k = 1;
      while (k < b) {
        sum = sum.add(Z.valueOf(b - k).pow(2 * n - 1).multiply(LongUtils.jacobi(b, k)));
        k += 2;
      }
    }
    return (n & 1) == 0 ? sum.negate() : sum;
  }

  private Z[] handleFactors(final long a, final long n) {
    Z mz = Z.ONE;
    Z bz = Z.ONE;
    final FactorSequence fs = Jaguar.factor(a);
    final ArrayList<Z> p = new ArrayList<>();
    for (final Z f : fs.toZArray()) {
      final int e = fs.getExponent(f);
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
        if (b == 1) {
          prod2 = prod2.multiply(piz.pow(2 * n).subtract(Z.ONE));
        } else {
          prod2 = prod2.multiply(piz.pow(2 * n).subtract(LongUtils.jacobi(b, pi)));
        }
      }
    }
    final Z r = prod2.multiply(Z.valueOf(prod1).pow(2 * n)).multiply(mz.pow(2 * n - 1));
    return new Z[] {bz, b == 1 && a != 1 ? r.divide2() : r};
  }

  private Z uncachedDbn(final long b, final int n) {
    if (b == 1 && n <= 1) {
      return Z.ONE;
    }
    Z r = bigDbn(b, n);
    for (int i = 1; i < n; ++i) {
      r = r.subtract(dbn(b, n - i).multiply(Z.valueOf(b * b).negate().pow(i))
                     .multiply(Binomial.binomial(2 * n - 1, 2 * i)));
    }
    return r;
  }

  private Z dbn(final long b, final int n) {
    final String key = b + "_" + n;
    Z r = mCache.get(key);
    if (r != null) {
      return r;
    }
    r = uncachedDbn(b, n);
    mCache.put(key, r);
    return r;
  }

  private Z dan(final long a, final int n) {
    final String key = a + "_" + n;
    Z r = mCache.get(key);
    if (r != null) {
      return r;
    }
    // Handle a=bm^2
    final Z[] sf = handleFactors(a, n);
    final long b = sf[0].longValue();
    r = a == b ? uncachedDbn(b, n) : dbn(b, n);
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
    return dan(getA(), getN());
  }
}
