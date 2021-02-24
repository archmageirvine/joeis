package irvine.oeis.a039;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A039743 Number k such that gcd(phi(k), k-1) = number of distinct prime factors of k.
 * @author Sean A. Irvine
 */
public class A039743 implements Sequence {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Cheetah.factor(++mN);
      if (LongUtils.gcd(fs.phi().longValueExact(), mN - 1) == fs.omega()) {
        return Z.valueOf(mN);
      }
    }
  }
}
