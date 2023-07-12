package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunctionInt2Sequence;

/**
 * A060016 Triangle T(n,k) = number of partitions of n into k distinct parts, 1 &lt;= k &lt;= n.
 * @author Sean A. Irvine
 */
public class A060016 extends MemoryFunctionInt2Sequence<Z> {

  /** Construct the sequence. */
  public A060016() {
    super(1);
  }

  private int mN = 0;
  private int mM = 0;

  @Override
  protected Z compute(final int n, final int m) {
    if (m < 0 || m > n) {
      return Z.ZERO;
    }
    return m == 0 ? (n == 0 ? Z.ONE : Z.ZERO) : get(n - m, m).add(get(n - m, m - 1));
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
