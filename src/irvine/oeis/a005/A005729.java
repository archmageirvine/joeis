package irvine.oeis.a005;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005729 <code>a(n)</code> is the smallest positive integer a for which there is <code>an</code> identity of the form <code>a*x =</code> Sum_{i=1..m} ai*gi(x)^n where <code>a1, </code>..., am are in Z and g1(x), ..., gm(x) are in Z[x].
 * @author Sean A. Irvine
 */
public class A005729 implements Sequence {

  // After Michel Marcus

  private int expa(final long p, final long n) {
    if ((p & 1) != 0) {
      return 1;
    }
    long j = 4;
    while (j <= n + 1) {
      if (n % (j - 1) == 0) {
        return 2;
      }
      j <<= 1;
      assert j >= 0;
    }
    return 1;
  }

  private int expb(final long p, final long n) {
    int r = 1;
    boolean ok = true;
    while (ok) {
      int m = 2;
      long ps;
      final Z zp = Z.valueOf(p);
      while ((ps = zp.pow(m * r).subtract(1).divide(zp.pow(r).subtract(1)).longValueExact()) <= n) {
        if (n % ps == 0) {
          return 1;
        }
        ++m;
      }
      if (m == 2) {
        ok = false;
      }
      ++r;
    }
    return 0;
  }

  private int expp(final long p, final long n) {
    return n % p == 0 ? expa(p, n) : expb(p, n);
  }

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z prod = Z.ONE;
    for (long p = 2; p < mN; p = mPrime.nextPrime(p)) {
      final Z t = Z.valueOf(p).pow(expp(p, mN));
      prod = prod.multiply(t);
    }
    return prod;
  }
}
