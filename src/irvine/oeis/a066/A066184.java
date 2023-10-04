package irvine.oeis.a066;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A066184 Sum of the first moments of all partitions of n.
 * @author Sean A. Irvine
 */
public class A066184 extends Sequence0 {

  // After Alois P. Heinz

  private int mN = -1;
  private final MemoryFunctionInt2<Z[]> mB = new MemoryFunctionInt2<>() {
    @Override
    protected Z[] compute(final int n, final int m) {
      if (n == 0 || m == 1) {
        return new Z[] {Z.ONE, Z.valueOf(n)};
      }
      final Z[] g = get(n, m - 1);
      final Z[] h = get(n - m, Math.min(n - m, m));
      return new Z[] {g[0].add(h[0]), g[1].add(h[1]).add(h[0].multiply((long) m * (m + 1) / 2))};
    }
  };


  @Override
  public Z next() {
    return mB.get(++mN, mN)[1];
  }
}
