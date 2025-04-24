package irvine.oeis.a076;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076947 Smallest k &gt; 0 such that nk+1 is a cube.
 * @author Sean A. Irvine
 */
public class A076947 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long k = 1;
    while (true) {
      if (LongUtils.modPow(++k, 3, mN) == 1 % mN) {
        return Z.valueOf(k).pow(3).subtract(1).divide(mN);
      }
    }
  }
}

