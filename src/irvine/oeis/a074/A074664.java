package irvine.oeis.a074;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A074664 Number of algebraically independent elements of degree n in the algebra of symmetric polynomials in noncommuting variables.
 * @author Sean A. Irvine
 */
public class A074664 extends Sequence1 {

  // After Peter Luschny

  private int mN = -1;
  private final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int n, final int k) {
      if (k == n) {
        return Z.ONE;
      }
      if (k < 0) {
        return Z.ZERO;
      }
      return get(n - 1, k).multiply(k).add(Integers.SINGLETON.sum(k - 1, n - 1, j -> get(n - 1, j)));
    }
  };

  @Override
  public Z next() {
    return mB.get(++mN, 0);
  }
}
