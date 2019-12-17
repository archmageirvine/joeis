package irvine.oeis.a028;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A028251.
 * @author Sean A. Irvine
 */
public class A028251 implements Sequence {

  private long mN = 0;

  private Q a(final long n, final long k) {
    return Q.ONE.add(new Q(k + 1, 2 * n));
  }

  private Q b(final long n, final long k) {
    return Q.TWO.add(new Q(2 * n, k));
  }

  private Q max(final long n, final long k) {
    final Q a = a(n, k);
    final Q b = b(n, k);
    return a.compareTo(b) >= 0 ? a : b;
  }

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.THREE;
    }
    final Z d = Z.valueOf(20 * mN).subtract(4).multiply(mN).add(1);
    final long k = CR.valueOf(d).sqrt().divide(CR.TWO).add(CR.valueOf(mN)).subtract(CR.HALF).floor().longValueExact();
    final Q u = max(mN, k);
    final Q v = max(mN, k + 1);
    return Z.valueOf(u.compareTo(v) <= 0 ? k : k + 1);
  }
}
