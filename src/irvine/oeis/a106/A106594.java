package irvine.oeis.a106;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A106594 a(n) = number of primitive solutions to 4n+1 = x^2 + y^2.
 * @author Sean A. Irvine
 */
public class A106594 extends Sequence1 {

  // After R. J. Mathar

  private long mN = 1;

  @Override
  public Z next() {
    mN += 4;
    long a = 0;
    for (long x = 1; x * x < mN; ++x) {
      final long y = mN - x * x;
      final long s = Functions.SQRT.l(y);
      if (s * s == y && s <= x && Functions.GCD.l(x, s) == 1) {
        ++a;
      }
    }
    return Z.valueOf(a);
  }
}
