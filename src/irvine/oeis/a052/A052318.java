package irvine.oeis.a052;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A052318 Number of labeled rooted trimmed trees with n nodes.
 * @author Sean A. Irvine
 */
public class A052318 extends A052316 {

  private final MemoryFactorial mF = MemoryFactorial.SINGLETON;
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Q sum = Q.ZERO;
    for (int k = mN; k >= 1; k -= 2) {
      final int t = (mN - k) / 2;
      final int e = (mN + k) / 2 - 2;
      final Q s;
      if (e >= 0) {
        s = new Q(Z.valueOf(k).pow(e), mF.factorial(t));
      } else {
        s = new Q(Z.ONE, Z.valueOf(k).pow(-e).multiply(mF.factorial(t)));
      }
      sum = sum.signedAdd((t & 1) == 0, s.divide(mF.factorial(k - 1)));
    }
    return sum.multiply(mF.factorial(mN)).toZ();
  }
}
