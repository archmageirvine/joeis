package irvine.oeis.a066;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066183 Total sum of squares of parts in all partitions of n.
 * @author Sean A. Irvine
 */
public class A066183 extends Sequence1 {

  // After Alois P. Heinz

  private static final Z[] ZERO = new Z[] {Z.ZERO, Z.ZERO};
  private int mN = 0;
  private final MemoryFunctionInt2<Z[]> mB = new MemoryFunctionInt2<>() {
    @Override
    protected Z[] compute(final int n, final int m) {
      if (n == 0) {
        return new Z[] {Z.ONE, Z.ZERO};
      }
      if (m < 1) {
        return ZERO;
      }
      if (m > n) {
        return get(n, m - 1);
      }
      final Z[] g = get(n, m - 1);
      final Z[] h = get(n - m, m);
      return new Z[] {g[0].add(h[0]), g[1].add(h[1]).add(h[0].multiply((long) m * m))};
    }
  };


  @Override
  public Z next() {
    return mB.get(++mN, mN)[1];
  }
}
