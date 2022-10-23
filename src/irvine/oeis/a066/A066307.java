package irvine.oeis.a066;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A066307 Nonprimes such that sum of digits equals product of digits.
 * @author Georg Fischer
 */
public class A066307 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (!mPrime.isPrime(++mN)) {
        if (ZUtils.digitSum(mN) == ZUtils.digitProduct(mN)) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}
