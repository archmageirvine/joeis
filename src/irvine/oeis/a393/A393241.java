package irvine.oeis.a393;

import java.util.Arrays;

import irvine.factor.prime.Fast;
import irvine.math.series.Series;
import irvine.math.series.SeriesRing;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A393241 allocated for Felix Huber.
 * @author Sean A. Irvine
 */
public class A393241 extends Sequence0 {

  private static final SeriesRing<Z> SZ = SeriesRing.SZ;
  private final Fast mPrime = new Fast();
  private int mN = -1;

  private int e(final int n, final long p) {
    int sum = 0;
    long pp = p;
    while (n / pp > 0) {
      sum += n / pp;
      pp *= p;
    }
    return sum;
  }

  @Override
  public Z next() {
    ++mN;
    Series<Z> prod = SZ.one();
    for (long p = 2; p <= mN; p = mPrime.nextPrime(p)) {
      final int e = e(mN, p);
      final Z[] c = new Z[e + 1];
      Arrays.fill(c, Z.ONE);
      prod = SZ.multiply(prod, SZ.create(c));
    }
    return prod.coeff(mN);
  }
}
