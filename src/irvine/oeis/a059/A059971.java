package irvine.oeis.a059;

import irvine.math.z.Z;
import irvine.oeis.a051.A051775;

/**
 * A059971 n^n using Nim multiplication.
 * @author Sean A. Irvine
 */
public class A059971 extends A051775 {

  private long mN = -1;

  private Z nimPow(final Z n, long k) {
    Z p = n;
    Z v = Z.ONE;
    while (k != 0) {
      if ((k & 1) == 1) {
        v = get(v, p);
      }
      p = get(p, p);
      k >>>= 1;
    }
    return v;
  }

  @Override
  public Z next() {
    return nimPow(Z.valueOf(++mN), mN);
  }
}
