package irvine.oeis.a081;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A081501 a(n) = row sum of triangle whose n-th row begins with n and contains n-1 smallest numbers coprime to n and greater than n.
 * @author Sean A. Irvine
 */
public class A081501 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    Z t = Z.ZERO;
    long s = ++mN + 1;
    long k = s;
    while (k < 2 * mN) {
      if (Functions.GCD.l(s, mN) == 1) {
        t = t.add(s);
        ++k;
      }
      ++s;
    }
    return t.add(mN);
  }
}
