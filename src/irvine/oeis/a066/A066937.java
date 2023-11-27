package irvine.oeis.a066;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066937 For n=1,2,3,..., define b(n) as follows: initialize v at v=n; then for k=2,3,4,..., if v&gt;0 and k divides v, replace v with v-k. Set b(n)=v. Then {a(n)} is the subsequence consisting of the nonzero terms of {b(n)}.
 * @author Sean A. Irvine
 */
public class A066937 extends Sequence1 {

  // After Mikhail Kurkov

  private long mN = 0;

  private long f(final long n, final long m) {
    for (final Z dd : Jaguar.factor(n).divisorsSorted()) {
      final long d = dd.longValue();
      if (d > m) {
        return d;
      }
    }
    throw new RuntimeException();
  }

  private long b(final long n) {
    if (n == 1) {
      return 1;
    }
    long a = n;
    long b = 1;
    while (a > b) {
      final long c = a;
      a -= f(a, b);
      b = f(c, b);
    }
    return a;
  }

  @Override
  public Z next() {
    while (true) {
      final long b = b(++mN);
      if (b > 0) {
        return Z.valueOf(b);
      }
    }
  }
}
