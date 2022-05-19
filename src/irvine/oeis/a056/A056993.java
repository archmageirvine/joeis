package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A056993 a(n) is the smallest k &gt;= 2 such that k^(2^n)+1 is prime, or -1 if no such k exists.
 * @author Sean A. Irvine
 */
public class A056993 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    final long exp = 1L << ++mN;
    Z k = Z.ONE;
    while (true) {
      k = k.add(1);
      if (k.pow(exp).add(1).isProbablePrime()) {
        return k;
      }
    }
  }
}
