package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A051010 Triangle T(m,n) giving of number of steps in the Euclidean algorithm for gcd(m,n) with 0&lt;=m&lt;n.
 * @author Sean A. Irvine
 */
public class A051010 extends Sequence1 {

  private long mN = 0;
  private long mM = 0;

  private static long countGcd(long a, long b) {
    int k = 0;
    while (a != 0) {
      final long t = a;
      a = b % a;
      b = t;
      ++k;
    }
    return k;
  }

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 0;
    }
    return Z.valueOf(countGcd(mM, mN));
  }
}
