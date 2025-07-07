package irvine.oeis.a078;

import irvine.math.MemoryFunction1;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a165.A165964;

/**
 * A078628 Number of ways of arranging the numbers 1..n in a circle so that there is no consecutive triple i, i+1, i+2 or i, i-1, i-2 (mod n).
 * @author Sean A. Irvine
 */
public class A078628 extends Sequence1 {

  private final DirectSequence mC = DirectSequence.create(new A165964());
  private int mN = 0;

  private final MemoryFunction1<Z> mB1 = new MemoryFunction1<>() {
    // b1(n) = b^{*n}_{0,1...n-2,n-1} in Dymacek and Lambert
    @Override
    protected Z compute(final int n) {
      if (n <= 5) {
        return Z.ZERO;
      }
      if (n == 6) {
        return Z.ONE;
      }
      if (n == 7) {
        return Z.TWO;
      }
      return mB2.get(n - 1).subtract(mB1.get(n - 1));
    }
  };

  private final MemoryFunction1<Z> mB2 = new MemoryFunction1<>() {
    // b2(n) = b^{*n}_{0..n-2,n-1}
    @Override
    protected Z compute(final int n) {
      if (n < 5) {
        return Z.ZERO;
      }
      if (n == 5) {
        return Z.ONE;
      }
      if (n == 6) {
        return Z.THREE;
      }
      return mB3.get(n - 1).subtract(mB2.get(n - 1));
    }
  };

  private final MemoryFunction1<Z> mB3 = new MemoryFunction1<>() {
    // b3(n) = b^{*n}_{0..n-1}
    @Override
    protected Z compute(final int n) {
      if (n < 5) {
        return Z.ZERO;
      }
      if (n == 5) {
        return Z.FOUR;
      }
      if (n == 6) {
        return Z.valueOf(16);
      }
      return mC.a(n - 1).add(mB1.get(n - 2));
    }
  };

  @Override
  public Z next() {
    if (++mN < 3) {
      return Z.ONE;
    }
    return mC.a(mN).subtract(mB1.get(mN).multiply2()).subtract(mB1.get(mN + 1).multiply(4));
  }
}

