package irvine.oeis.a008;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunction2Sequence;

/**
 * A008289 Triangle read by rows: Q(n,m) = number of partitions of n into m distinct parts, n&gt;=1, m&gt;=1.
 * @author Sean A. Irvine
 */
public class A008289 extends MemoryFunction2Sequence<Integer, Z> {

  protected A008289(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A008289() {
    this(1);
  }

  private int mN = 0;
  private int mM = 0;

  @Override
  protected Z compute(final Integer n, final Integer k) {
    if (k <= 0 || n <= 0) {
      return Z.ZERO;
    }
    if (n == 1 && k == 1) {
      return Z.ONE;
    }
    return get(n - k, k).add(get(n - k, k - 1));
  }

  @Override
  public Z next() {
    if (++mM > (Functions.SQRT.i(8 * mN + 1) - 1) / 2) {
      ++mN;
      mM = 1;
    }
    return get(mN, mM);
  }
}
