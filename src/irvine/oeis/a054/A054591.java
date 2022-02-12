package irvine.oeis.a054;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A054591 Denominators of rational numbers that belong to the Cantor set.
 * @author Sean A. Irvine
 */
public class A054591 implements Sequence {

  private long mN = 0;

  private boolean isCantor(Z p, Z q) {
    Z[] qr;
    while ((qr = q.divideAndRemainder(Z.THREE))[1].isZero()) {
      q = qr[0];
      if (Z.ONE.equals(p.divide(q))) {
        return p.equals(q);
      }
      p = p.mod(q);
    }
    final Z ps = p;
    do {
      final Z p3 = p.multiply(3);
      if (Z.ONE.equals(p3.divide(q))) {
        return false;
      }
      p = p3.mod(q);
    } while (!p.equals(ps));
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      if (++mN == 1) {
        return Z.ONE;
      }
      final Z q = Z.valueOf(mN);
      for (long p = 1; p < mN; ++p) {
        if (LongUtils.gcd(p, mN) == 1 && isCantor(Z.valueOf(p), q)) {
          return q;
        }
      }
    }
  }
}
