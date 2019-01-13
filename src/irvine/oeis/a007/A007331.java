package irvine.oeis.a007;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007331.
 * @author Sean A. Irvine
 */
public class A007331 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    if (++mN <= 1) {
      return Z.valueOf(mN);
    }
    Z s = Z.ZERO;
    for (final Z d : Cheetah.factor(mN).divisors()) {
      if (((mN / d.longValueExact()) & 1) == 1) {
        s = s.add(d.pow(3));
      }
    }
    return s;
  }
}
