package irvine.oeis.a015;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A015975 First k&gt;n, not a power of n+1 or one of its prime factors, such that k | n^k + 1.
 * @author Sean A. Irvine
 */
public class A015975 implements Sequence {

  private Z mN = Z.ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    Z k = mN.add(1);
    while (true) {
      k = k.add(1);
      if (mN.modPow(k, k).equals(k.subtract(1).mod(k))) {
        final Z n1 = mN.add(1);
        final Z base = k.isPower();
        if (base == null || !n1.mod(base).isZero()) {
          return k;
        }
      }
    }
  }
}
