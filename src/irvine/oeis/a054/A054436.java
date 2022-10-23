package irvine.oeis.a054;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence3;

/**
 * A054436 Smallest area of a Pythagorean triangle with n as length of a leg.
 * @author Sean A. Irvine
 */
public class A054436 extends Sequence3 {

  protected long mN = 2;

  @Override
  public Z next() {
    ++mN;
    long b = 0;
    while (true) {
      ++b;
      final long c2 = mN * mN + b * b;
      final long c = LongUtils.sqrt(c2);
      if (c * c == c2) {
        return Z.valueOf(mN * b / 2);
      }
    }
  }
}
