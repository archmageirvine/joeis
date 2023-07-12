package irvine.oeis.a059;

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.a008.A008284;
import irvine.oeis.memory.MemoryFunctionInt2Sequence;

/**
 * A059623 As upper right triangle, number of weakly unimodal partitions of n where initial part is k (n &gt;= k &gt;= 1).
 * @author Sean A. Irvine
 */
public class A059623 extends MemoryFunctionInt2Sequence<Z> {

  /** Construct the sequence. */
  public A059623() {
    super(1);
  }

  private final A008284 mS = new A008284();
  private int mN = 0;
  private int mM = 0;

  @Override
  protected Z compute(final int n, final int m) {
    if (n == m) {
      return Z.ONE;
    }
    return mS.get((long) n, (long) m).subtract(mS.get((long) n - m, (long) m)).add(Integers.SINGLETON.sum(m, n, k -> get(n - m, k)));
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
