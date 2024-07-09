package irvine.oeis.a071;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a033.A033950;

/**
 * A071227 Number of solutions 1&lt;=x&lt;=m to gcd(m,x) = tau(m) where m = A033950(n).
 * @author Sean A. Irvine
 */
public class A071227 extends A033950 {

  @Override
  public Z next() {
    final Z t = super.next();
    final Z s0 = Functions.SIGMA0.z(t);
    long cnt = 0;
    for (long k = 1; k <= t.longValueExact(); ++k) {
      if (Functions.GCD.z(t, k).equals(s0)) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
