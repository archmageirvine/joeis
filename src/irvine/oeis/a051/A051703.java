package irvine.oeis.a051;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000720;
import irvine.oeis.memory.MemoryFunction2Sequence;

/**
 * A051703 Maximal value of products of partitions of n into powers of distinct primes (1 not considered a power).
 * @author Sean A. Irvine
 */
public class A051703 extends MemoryFunction2Sequence<Integer, Z> {

  // After Alois P. Heinz

  private final Sequence mPrimePi = new PrependSequence(new A000720(), 0);
  private int mN = -1;

  @Override
  protected Z compute(final Integer n, final Integer m) {
    if (n == 0) {
      return Z.ONE;
    }
    if (m < 1 || n < 0) {
      return Z.ZERO;
    }
    final int p = Functions.PRIME.i(m);
    Z b = get(n, m - 1);
    final int plog = (int) (Math.log(n) / Math.log(p));
    for (int j = 1, pj = p; j <= plog; ++j, pj *= p) {
      b = b.max(get(n - pj, m - 1).multiply(pj));
    }
    return b;
  }

  @Override
  public Z next() {
    return get(++mN, mPrimePi.next().intValueExact());
  }
}
