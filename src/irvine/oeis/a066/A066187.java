package irvine.oeis.a066;

import irvine.math.MemoryFunctionInt3;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A066187 Sum of the second moments of all partitions of n.
 * @author Sean A. Irvine
 */
public class A066187 extends Sequence0 {

  // After Alois P. Heinz

  private static final Z[] ZERO = new Z[] {Z.ZERO, Z.ZERO};
  private int mN = -1;
  protected final MemoryFunctionInt3<Z[]> mB = new MemoryFunctionInt3<>() {
    @Override
    protected Z[] compute(final int n, final int m, final int t) {
      if (n == 0) {
        return new Z[] {Z.ONE, Z.ZERO};
      }
      if (m < 1) {
        return ZERO;
      }
      if (m > n) {
        return get(n, m - 1, t);
      }
      final Z[] g = get(n, m - 1, t);
      final Z[] h = get(n - m, m, t + 1);
      return new Z[] {g[0].add(h[0]), g[1].add(h[1]).add(h[0].multiply((long) m * t * t))};
    }
  };


  @Override
  public Z next() {
    return mB.get(++mN, mN, 1)[1];
  }
}
