package irvine.oeis.a076;

import irvine.math.MemoryFunctionInt2;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A076220 Number of permutations of 1..n in which every pair of adjacent numbers are relatively prime.
 * @author Sean A. Irvine
 */
public class A076220 extends Sequence0 {

  // After Alois P. Heinz

  private long mN = -1;
  private final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int set, final int t) {
      if (set == 0) {
        return Z.ONE;
      }
      Z sum = Z.ZERO;
      for (int k = 1, s = set; s != 0; ++k, s >>>= 1) {
        if ((s & 1) == 1 && Functions.GCD.i(k, t) == 1) {
          sum = sum.add(mB.get(set - (1 << (k - 1)), k));
        }
      }
      return sum;
    }
  };

  @Override
  public Z next() {
    if (++mN >= Integer.SIZE) {
      throw new UnsupportedOperationException();
    }
    return mB.get((1 << mN) - 1, 2147483647);
  }
}
