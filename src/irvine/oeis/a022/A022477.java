package irvine.oeis.a022;

import irvine.math.z.Z;
import irvine.oeis.a006.A006711;

/**
 * A022477 Number of 1's in n-th term of A006711.
 * @author Sean A. Irvine
 */
public class A022477 extends A006711 {

  static long count(Z n, final Z r) {
    long c = 0;
    while (!n.isZero()) {
      final Z[] qr = n.divideAndRemainder(Z.TEN);
      if (r.equals(qr[1])) {
        ++c;
      }
      n = qr[0];
    }
    return c;
  }

  @Override
  public Z next() {
    return Z.valueOf(count(super.next(), Z.ONE));
  }
}
