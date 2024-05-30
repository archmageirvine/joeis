package irvine.oeis.a006;

import irvine.math.function.Functions;
import irvine.math.z.Z;

/**
 * A006703 Solution to Pellian: y such that x^2 - n*y^2 = +-1.
 * @author Sean A. Irvine
 */
public class A006703 extends A006702 {

  @Override
  public Z next() {
    final long n = ++mN;
    final long s = Functions.SQRT.l(n);
    if (s * s == mN) {
      return Z.ZERO;
    }
    return solve(mN).den();
  }
}
