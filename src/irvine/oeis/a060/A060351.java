package irvine.oeis.a060;

import irvine.math.MemoryFunctionInt3;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A060351 If the binary expansion of n has k bits, let S be the subset of [k-1] such that i is in S if the i-th bit of n is a 1 (with the first bit being the least significant bit); a(n) is the number of permutations of [k] with descent set S.
 * @author Sean A. Irvine
 */
public class A060351 extends Sequence0 {

  // After Alois P. Heinz

  private int mN = 0;
  private int mM = -1;

  private final MemoryFunctionInt3<Z> mB = new MemoryFunctionInt3<>() {
    @Override
    protected Z compute(final int u, final int o, final int t) {
      if (u + o == 0) {
        return t == 0 ? Z.ONE : Z.ZERO;
      }
      if ((t & 1) == 0) {
        return Integers.SINGLETON.sum(1, u, k -> get(u - k, o + k - 1, t / 2));
      } else {
        return Integers.SINGLETON.sum(1, o, k -> get(u + k - 1, o - k, t / 2));
      }
    }
  };

  @Override
  public Z next() {
    if (mM == -1) {
      ++mM;
      return Z.ONE;
    }
    if (++mM >= 1 << (mN - 1)) {
      ++mN;
      mM = 0;
    }
    return mB.get(mN, 0, 2 * mM);
  }
}
