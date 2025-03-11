package irvine.oeis.a075;

import irvine.math.MemoryFunction;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A075851 Number of permutations s of {1,2,...,n} such that |s(i)-i|&gt;2 for each i=1,2,...,n.
 * @author Sean A. Irvine
 */
public class A075851 extends Sequence0 {

  // After Alois P. Heinz

  private int mN = -1;
  private Z mA = Z.ZERO;
  private final MemoryFunction<Z, Z> mB = new MemoryFunction<>() {
    @Override
    protected Z compute(final Z set) {
      final int n = set.bitCount();
      if (n == 0) {
        return Z.ONE;
      }
      Z sum = Z.ZERO;
      for (int k = 0; k < set.bitLength(); ++k) {
        if (set.testBit(k) && Math.abs(n - k) > 2) {
          sum = sum.add(mB.getValue(set.clearBit(k)));
        }
      }
      return sum;
    }
  };

  @Override
  public Z next() {
    if (++mN > 0) {
      mA = mA.setBit(mN);
    }
    return mB.getValue(mA);
  }
}

