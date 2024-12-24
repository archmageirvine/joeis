package irvine.oeis.a073;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A073865 Largest n-digit prime with digit sum n, or 0 if no such prime exists.
 * @author Sean A. Irvine
 */
public class A073865 extends Sequence1 {

  // After Andrew Howroyd

  private long mN = 0;

  private Z search(final long k, final long r, final Z p) {
    if (k == 1) {
      if (r <= 9) {
        final Z q = p.add(r);
        if (q.isProbablePrime()) {
          return q;
        }
      }
      return Z.ZERO;
    }
    Z t = Z.ZERO;
    long c = Math.min(r - 1, 9);
    while (c >= 0 && t.isZero()) {
      t = search(k - 1, r - c, p.add(c).multiply(10));
      --c;
    }
    return t;
  }

  @Override
  public Z next() {
    if (++mN % 3 == 0) {
      return Z.ZERO;
    }
    long c = Math.min(mN, 9);
    Z t = Z.ZERO;
    while (c > 0 && t.isZero()) {
      t = search(mN - 1, mN - c, Z.TEN.multiply(c));
      --c;
    }
    return t;
  }
}
