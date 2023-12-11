package irvine.oeis.a047;

import irvine.math.z.Z;
import irvine.oeis.a121.A121373;
import irvine.oeis.memory.MemoryFunction2Sequence;
import irvine.oeis.memory.MemorySequence;

/**
 * A047265 Triangle T(n,k), for n &gt;= 1, 1 &lt;= k &lt;= n, read by rows, giving coefficient of x^n in expansion of (Product_{j&gt;=1} (1-(-x)^j) - 1 )^k.
 * @author Sean A. Irvine
 */
public class A047265 extends MemoryFunction2Sequence<Long, Z> {

  /** Construct the sequence. */
  public A047265() {
    super(1);
  }

  // After Alois P. Heinz

  private final MemorySequence mG = MemorySequence.cachedSequence(new A121373());
  private long mN = 0;
  private long mM = 0;

  @Override
  protected Z compute(final Long n, final Long m) {
    if (m == 0) {
      return n == 0 ? Z.ONE : Z.ZERO;
    }
    if (m == 1) {
      return n == 0 ? Z.ZERO : mG.a(n.intValue());
    }
    final long q = m / 2;
    Z sum = Z.ZERO;
    for (long j = 0; j <= n; ++j) {
      sum = sum.add(get(j, q).multiply(get(n - j, m - q)));
    }
    return sum;
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return get(mN, mM);
  }
}
