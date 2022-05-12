package irvine.oeis.a056;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A056867 Nilpotent numbers: n such that every group of order n is nilpotent.
 * @author Sean A. Irvine
 */
public class A056867 implements Sequence {

  private long mN = 0;

  private boolean is(final long n) {
    final FactorSequence fs = Cheetah.factor(n);
    for (final Z p : fs.toZArray()) {
      for (int j = 1; j <= fs.getExponent(p); ++j) {
        if (LongUtils.gcd(n, p.pow(j).longValueExact() - 1) > 1) {
          return false;
        }
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      if (is(++mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}

