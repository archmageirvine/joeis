package irvine.oeis.a224;

import irvine.math.MemoryFunction2;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A224345 Number of closed normal forms of size n in lambda calculus with size 0 for the variables.
 * @author Gregory Morse
 */
public class A224345 extends Sequence1 {

  private int mN;
  private final MemoryFunction2<Integer, Z> mNormal = new MemoryFunction2<>() {
    @Override
    protected Z compute(final Integer n, final Integer binders) {
      return n == 0 ? Z.valueOf(binders) : get(n - 1, binders + 1).add(mNeutral.get(n, binders));
    }
  };

  private final MemoryFunction2<Integer, Z> mNeutral = new MemoryFunction2<>() {
    @Override
    protected Z compute(final Integer n, final Integer binders) {
      if (n == 0) {
        return Z.valueOf(binders);
      }
      // A neutral term is a variable followed by zero or more normal arguments.
      Z sum = Z.ZERO;
      for (int k = 0; k < n; ++k) {
        sum = sum.add(get(n - 1 - k, binders).multiply(mNormal.get(k, binders)));
      }
      return sum;
    }
  };

  @Override
  public Z next() {
    return mNormal.get(++mN, 0);
  }
}
