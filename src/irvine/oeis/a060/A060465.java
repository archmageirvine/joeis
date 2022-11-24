package irvine.oeis.a060;

import irvine.math.LongUtils;
import irvine.math.z.Z;

/**
 * A060465 Value of x of the solution to x^3 + y^3 + z^3 = A060464(n) (numbers not 4 or 5 mod 9) with smallest |z| and smallest |y|, 0 &lt;= |x| &lt;= |y| &lt;= |z|.
 * @author Sean A. Irvine
 */
public class A060465 extends A060464 {

  static Z check(final Z x3, final long y, final long z, final Z n) {
    final Z x = x3.root(3);
    if (x3.auxiliary() != 1 || x.bitLength() > 63) {
      return null;
    }
    final long lx = x.longValue();
    if (Math.abs(lx) > y) {
      return null;
    }
    final long d = Math.abs(LongUtils.gcd(lx, y, z));
    return d == 1 || n.mod(d) != 0 ? x : null;
  }

  @Override
  public Z next() {
    final Z n = super.next();
    if (n.isZero()) {
      return Z.ZERO;
    }
    long z = 0;
    while (true) {
      final Z z3 = Z.valueOf(++z).pow(3);
      final Z nz3 = n.subtract(z3);
      if (nz3.isZero()) {
        return Z.ZERO;
      }
      final Z pz3 = n.add(z3);
      for (long y = 0; y <= z; ++y) {
        final Z y3 = Z.valueOf(y).pow(3);
        final Z x1 = check(nz3.subtract(y3), y, z, n);
        Z res = null;
        if (x1 != null) {
          res = x1;
        }
        final Z x2 = check(nz3.add(y3), y, z, n);
        if (x2 != null && (res == null || x2.abs().compareTo(res.abs()) < 0)) {
          res = x2;
        }
        final Z x3 = check(pz3.subtract(y3), y, z, n);
        if (x3 != null && (res == null || x3.abs().compareTo(res.abs()) < 0)) {
          res = x3;
        }
        final Z x4 = check(pz3.add(y3), y, z, n);
        if (x4 != null && (res == null || x4.abs().compareTo(res.abs()) < 0)) {
          res = x4;
        }
        if (res != null) {
          return res;
        }
      }
    }
  }
}
