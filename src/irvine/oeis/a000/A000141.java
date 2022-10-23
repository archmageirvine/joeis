package irvine.oeis.a000;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A000141 Number of ways of writing n as a sum of 6 squares.
 * @author Sean A. Irvine
 */
public class A000141 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    } else if (mN == 1) {
      return Z.valueOf(12);
    } else {
      final FactorSequence fs = Jaguar.factor(mN);
      Z sum = Z.FOUR.negate();
      if ((mN & 3) == 1) {
        sum = sum.add(16);
      } else if ((mN & 3) == 3) {
        sum = sum.subtract(16);
      }
      for (final Z dd : fs.divisors()) {
        final long d = dd.longValue();
        if (d == 1) {
          continue;
        }
        if ((d & 3) == 3) {
          sum = sum.add(dd.square().shiftLeft(2));
        } else if ((d & 3) == 1) {
          sum = sum.subtract(dd.square().shiftLeft(2));
        }
        final long m = mN / d;
        if ((m & 3) == 1) {
          sum = sum.add(dd.square().shiftLeft(4));
        } else if ((m & 3) == 3) {
          sum = sum.subtract(dd.square().shiftLeft(4));
        }
      }
      return sum;
    }
  }
}

