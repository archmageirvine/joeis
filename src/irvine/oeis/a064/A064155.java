package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a000.A000040;

/**
 * A064152 Erdos primes: primes p such that all p-k! for 1&lt;=k!&lt;p are composite.
 * @author Sean A. Irvine
 */
public class A064155 extends A000040 {

  private long mDigits = 1;
  private Z mLimit = Z.TEN;

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (p.compareTo(mLimit) >= 0) {
        mLimit = mLimit.multiply(10);
        ++mDigits;
      }
      if (ZUtils.digitProduct(p).equals(Z.valueOf(ZUtils.digitSum(p)).multiply(mDigits))) {
        return p;
      }
    }
  }
}
