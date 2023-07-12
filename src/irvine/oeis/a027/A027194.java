package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunctionInt3Sequence;

/**
 * A027194 Number of partitions of n into an even number of parts, the least being 2; also, a(n+2) = number of partitions of n into an odd number of parts, each &gt;=2.
 * @author Sean A. Irvine
 */
public class A027194 extends MemoryFunctionInt3Sequence<Z> {

  // After Alois P. Heinz

  private int mN = -leastPart();

  /** Construct the sequence. */
  public A027194() {
    super(1);
  }

  protected int leastPart() {
    return 2;
  }

  @Override
  protected Z compute(final int n, final int m, final int t) {
    if (n == 0) {
      return Z.valueOf(t);
    }
    if (m > n) {
      return Z.ZERO;
    }
    return get(n, m + 1, t).add(get(n - m, m, 1 - t));
  }

  @Override
  public Z next() {
    return get(++mN, leastPart(), 0);
  }
}
