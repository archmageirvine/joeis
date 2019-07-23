package irvine.oeis.a024;

import irvine.math.MemoryFunction2;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A024787 Number of <code>3</code>'s in all partitions of <code>n</code>.
 * @author Sean A. Irvine
 */
public class A024787 extends MemoryFunction2<Integer, Z[]> implements Sequence {

  // After Alois P. Heinz

  private static final Z[] C1 = {Z.ONE, Z.ZERO};
  private static final Z[] C2 = {Z.ZERO, Z.ZERO};
  private int mN = 0;

  protected int target() {
    return 3;
  }

  @Override
  protected Z[] compute(final Integer n, final Integer m) {
    if (n == 0 || m == 1) {
      return C1;
    }
    final Z[] g = m > n ? C2 : get(n - m, m);
    final Z[] b = get(n, m - 1);
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
