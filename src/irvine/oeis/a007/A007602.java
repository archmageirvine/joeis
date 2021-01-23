package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A007602 Numbers that are divisible by the product of their digits.
 * @author Sean A. Irvine
 */
public class A007602 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final long n = ++mN;
      final long prod = ZUtils.digitProduct(n);
      if (prod != 0 && mN % prod == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
