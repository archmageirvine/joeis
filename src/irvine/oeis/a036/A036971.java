package irvine.oeis.a036;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a000.A000045;

/**
 * A036971 Numbers n such that the n-th Fibonacci number reversed is prime.
 * @author Sean A. Irvine
 */
public class A036971 extends A000045 {

  private int mN = -1;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (ZUtils.reverse(super.next()).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}

