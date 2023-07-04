package irvine.oeis.a057;

import irvine.factor.prime.Fast;
import irvine.math.IntegerUtils;
import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunctionInt3Sequence;

/**
 * A057568 Number of partitions of n where n divides the product of the parts.
 * @author Sean A. Irvine
 */
public class A057568 extends MemoryFunctionInt3Sequence<Z> {

  // After Alois P. Heinz

  private final Fast mPrime = new Fast();
  private int mN = 0;

  @Override
  protected Z compute(final int n, final int i, final int t) {
    if (n == 0) {
      return t == 1 ? Z.ONE : Z.ZERO;
    }
    if (i < 1) {
      return Z.ZERO;
    }
    final Z b = get(n, i - 1, t);
    return i > n ? b : b.add(get(n - i, Math.min(i, n - i), t / IntegerUtils.gcd(i, t)));
  }

  @Override
  public Z next() {
    return mPrime.isPrime(++mN) ? Z.ONE : get(mN, mN, mN);
  }
}
