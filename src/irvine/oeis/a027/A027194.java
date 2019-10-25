package irvine.oeis.a027;

import irvine.math.MemoryFunctionInt3;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A027194 Number of partitions of n into an even number of parts, the least being 2; also, <code>a(n+2) =</code> number of partitions of n into an odd number of parts, each <code>&gt;=2</code>.
 * @author Sean A. Irvine
 */
public class A027194 extends MemoryFunctionInt3<Z> implements Sequence {

  // After Alois P. Heinz

  private int mN = -leastPart();

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
