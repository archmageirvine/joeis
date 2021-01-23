package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A001101 Moran numbers: n such that (n / sum of digits of n) is prime.
 * @author Sean A. Irvine
 */
public class A001101 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final long ds = ZUtils.digitSum(mN);
      if (mN.mod(ds) == 0 && mN.divide(ds).isPrime()) {
        return mN;
      }
    }
  }
}

