package irvine.oeis.a000;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000143.
 * @author Sean A. Irvine
 */
public class A000143 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    } else if (mN == 1) {
      return Z.valueOf(16);
    } else {
      final FactorSequence fs = Cheetah.factor(mN);
      Z sum = Z.ZERO;
      for (final Z dd : fs.divisors()) {
        final long d = dd.longValue();
        final Z d3 = dd.pow(3);
        sum = sum.signedAdd((d & 1) == 0, d3);
      }
      sum = sum.shiftLeft(4);
      if ((mN & 1) == 1) {
        sum = sum.negate();
      }
      return sum;
    }
  }
}

