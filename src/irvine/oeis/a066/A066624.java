package irvine.oeis.a066;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A066624 Number of 1's in binary expansion of parts in all partitions of n.
 * @author Sean A. Irvine
 */
public class A066624 extends Sequence0 {

  private static final Z[] ZERO = {Z.ZERO, Z.ZERO};
  private static final Z[] ONE = {Z.ONE, Z.ZERO};
  private int mN = -1;
  private final MemoryFunctionInt2<Z[]> mB = new MemoryFunctionInt2<>() {
    @Override
    protected Z[] compute(final int n, final int m) {
      // (n,m) -> (a,b) where a is number of partitions of a max part m and b is corresponding number of 1s
      if (n == 0) {
        return ONE;
      }
      if (m <= 0) {
        return ZERO;
      }
      final Z[] t = get(n, m - 1);
      final Z[] u = get(n - m, Math.min(n - m, m));
      return new Z[] {t[0].add(u[0]), t[1].add(u[1]).add(u[0].multiply(Integer.bitCount(m)))};
    }
  };

  @Override
  public Z next() {
    return mB.get(++mN, mN)[1];
  }
}
