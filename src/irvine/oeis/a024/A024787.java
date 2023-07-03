package irvine.oeis.a024;

import irvine.oeis.memory.MemoryFunction2Sequence;
import irvine.math.z.Z;

/**
 * A024787 Number of 3's in all partitions of n.
 * @author Sean A. Irvine
 */
public class A024787 extends MemoryFunction2Sequence<Integer, Z[]> {

  // After Alois P. Heinz

  private static final Z[] C1 = {Z.ONE, Z.ZERO};
  private int mN = 0;

  protected int target() {
    return 3;
  }

  @Override
  protected Z[] compute(final Integer n, final Integer m) {
    if (n == 0 || m == 1) {
      return C1;
    }
    final Z[] b = get(n, m - 1);
    if (m > n) {
      return b;
    }
    final Z[] g = get(n - m, m);
    return new Z[] {
      b[0].add(g[0]),
      b[1].add(g[1]).add(m == target() ? g[0] : Z.ZERO)
    };
  }

  @Override
  public Z next() {
    return get(++mN, mN)[1];
  }
}
