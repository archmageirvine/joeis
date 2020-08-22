package irvine.oeis.a106;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A106594 a(n) = number of primitive solutions to 4n+1 = x^2 + y^2.
 * @author Sean A. Irvine
 */
public class A106594 implements Sequence {

  // After R. J. Mathar

  private long mN = 1;

  @Override
  public Z next() {
    mN += 4;
    long a = 0;
    for (long x = 1; x * x < mN; ++x) {
      final long y = mN - x * x;
      final long s = LongUtils.sqrt(y);
      if (s * s == y && s <= x && LongUtils.gcd(x, s) == 1) {
        ++a;
      }
    }
    return Z.valueOf(a);
  }
}
