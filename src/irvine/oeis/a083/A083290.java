package irvine.oeis.a083;

import irvine.math.MemoryFunctionInt3;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A083290 Number of partitions of n into distinct parts which are coprime to n and which are also pairwise relatively prime.
 * @author Sean A. Irvine
 */
public class A083290 extends Sequence1 {

  // After Andrew Howroyd

  private int mN = 0;
  private final MemoryFunctionInt3<Z> mB = new MemoryFunctionInt3<>() {
    @Override
    protected Z compute(final int r, final int p, final int k) {
      if (k == 0) {
        return r == 0 ? Z.ONE : Z.ZERO;
      }
      final Z t = get(r, p, k - 1);
      return Functions.GCD.i(p, k) == 1 ? t.add(get(r - k, p * k, Math.min(r - k, k - 1))) : t;
    }
  };

  @Override
  public Z next() {
    return mB.get(++mN, mN, mN);
  }
}
