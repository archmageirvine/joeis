package irvine.oeis.a015;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A015975 First <code>k&gt;n</code>, not a power of <code>n+1</code> or one of its prime factors, such that <code>k | n^k + 1</code>.
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
        if (base == null || !Z.ZERO.equals(n1.mod(base))) {
          return k;
        }
      }
    }
  }
}
