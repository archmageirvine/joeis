package irvine.oeis.a067;

import irvine.factor.prime.Fast;
import irvine.math.MemoryFunctionInt3;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A067618 Number of self-conjugate partitions of n into prime parts.
 * @author Sean A. Irvine
 */
public class A067618 extends Sequence0 {

  private int mN = -1;
  private final Fast mPrime = new Fast();
  private final MemoryFunctionInt3<Z> mB = new MemoryFunctionInt3<>() {
    @Override
    protected Z compute(final int n, final int m, final int k) {
      if (n == 0) {
        return Z.ONE;
      }
      if (m <= 0 || n < 0) {
        return Z.ZERO;
      }
      Z res = get(n, m - 1, k);
      if (mPrime.isPrime(m + k)) {
        for (int r = 1; r <= m; ++r) {
          if (mPrime.isPrime(r + k)) {
            res = res.add(get(n - r * (2 * m - r), m -r - 1, k + r));
          }
        }
      }
      return res;
    }
  };

  @Override
  public Z next() {
    return mB.get(++mN, mN / 4 + 1, 0);
  }
}
