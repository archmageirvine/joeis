package irvine.oeis.a030;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000144;

/**
 * A030212.
 * @author Sean A. Irvine
 */
public class A030212 implements Sequence {

  private long mN = 0;
  private final Sequence mA144 = new A000144();

  {
    mA144.next();
  }

  @Override
  public Z next() {
    if (++mN < 2) {
      mA144.next();
      return Z.valueOf(mN);
    }
    Z sum1 = Z.ONE; // handle 1 | n
    Z sum2 = Z.ZERO;
    if ((mN & 3) == 1) {
      sum2 = Z.ONE;
    } else if ((mN & 3) == 3) {
      sum2 = Z.NEG_ONE;
    }
    for (final Z d : Cheetah.factor(mN).divisors()) {
      final long dd = d.longValue();
      if (dd == 1) {
        continue;
      }
      if ((dd & 3) == 1) {
        sum1 = sum1.add(d.square().square());
      } else if ((dd & 3) == 3) {
        sum1 = sum1.subtract(d.square().square());
      }
      final long t = mN / dd;
      if ((t & 3) == 1) {
        sum2 = sum2.add(d.square().square());
      } else if ((t & 3) == 3) {
        sum2 = sum2.subtract(d.square().square());
      }
    }
    sum2 = sum2.shiftLeft(4).add(sum1).shiftLeft(2);
    return mA144.next().multiply(5).subtract(sum2).shiftRight(5);
  }
}

