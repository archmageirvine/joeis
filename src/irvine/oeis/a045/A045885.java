package irvine.oeis.a045;

import irvine.factor.factor.Cheetah;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A045885 Largest number m such that in base n, the sum of digits in the divisors of m is m (written in base 10).
 * @author Sean A. Irvine
 */
public class A045885 implements Sequence {

  // After Eric M. Schmidt

  private int mN = 1;

  @Override
  public Z next() {
    ++mN;
    long res = 1;
    long m = 1;
    final double ln = Math.log(mN);
    while ((mN - 1) * (Math.log(++m) / ln + 2) * 2 * (LongUtils.sqrt(m) + 1) >= m) {
      Z s = Z.ZERO;
      for (final Z d : Cheetah.factor(m).divisors()) {
        s = s.add(ZUtils.digitSum(d, mN));
      }
      if (s.longValueExact() == m) {
        res = m;
      }
    }
    return Z.valueOf(res);
  }
}
