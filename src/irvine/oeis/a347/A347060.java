package irvine.oeis.a347;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A347060 Total number of 1's in the binary expansion of parts in all partitions of n into distinct parts.
 * @author Sean A. Irvine
 */
public class A347060 extends Sequence0 {

  // After Alois P. Heinz

  private static final Z[] ZERO = new Z[] {Z.ZERO, Z.ZERO};
  private int mN = -1;
  private final MemoryFunctionInt2<Z[]> mB = new MemoryFunctionInt2<>() {
    @Override
    protected Z[] compute(final int n, final int m) {
      if (n == 0) {
        return new Z[] {Z.ONE, Z.ZERO};
      }
      if (n > m * (m + 1) / 2) {
        return ZERO;
      } else {
        final Z[] p = mB.get(n - m, Math.min(n - m, m - 1));
        final Z[] u = mB.get(n, m - 1);
        return new Z[] {u[0].add(p[0]), u[1].add(p[1]).add(p[0].multiply(Integer.bitCount(m)))};
      }
    }
  };

  @Override
  public Z next() {
    return mB.get(++mN, mN)[1];
  }
}
