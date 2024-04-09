package irvine.oeis.a069;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A069089 a(n) is the number of 0's in a p X p square of a particular function mod p (see Formula) where p is the n-th prime.
 * @author Sean A. Irvine
 */
public class A069089 extends A000040 {

  @Override
  public Z next() {
    final long p = super.next().longValueExact();
    long cnt = 0;
    // See w(i,j|a,b,c) on p. 159 of Razpet (but here a=b=c=1)
    // Also, symmetry down main diagonal
    for (long i = 0 ; i < p; ++i) {
      for (long j = i; j < p; ++j) {
        long s = 0;
        for (long k = j; k <= i + j; ++k) {
          final long t = Binomial.binomial(k, i, p) * Binomial.binomial(i, k - j, p);
          s += t % p;
          s %= p;
        }
        if (s == 0) {
          cnt += i == j ? 1 : 2;
        }
      }
    }
    return Z.valueOf(cnt);
  }
}

