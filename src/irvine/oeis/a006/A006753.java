package irvine.oeis.a006;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A006753 Smith (or joke) numbers: composite numbers n such that sum of digits of n = sum of digits of prime factors of n (counted with multiplicity).
 * @author Sean A. Irvine
 */
public class A006753 implements Sequence {

  private Z mN = Z.THREE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (!mN.isProbablePrime()) {
        final long d = ZUtils.digitSum(mN);
        final FactorSequence fs = Jaguar.factor(mN);
        long s = 0;
        for (final Z p : fs.toZArray()) {
          s += ZUtils.digitSum(p) * fs.getExponent(p);
        }
        if (s == d) {
          return mN;
        }
      }
    }
  }
}

