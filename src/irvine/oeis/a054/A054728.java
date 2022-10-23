package irvine.oeis.a054;

import irvine.math.IntegerUtils;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a001.A001617;
import irvine.util.array.DynamicIntArray;

/**
 * A054728 a(n) is the smallest level N such that genus of modular curve X_0(N) is n (or -1 if no such curve exists).
 * @author Sean A. Irvine
 */
public class A054728 extends Sequence0 {

  private final MemorySequence mA = MemorySequence.cachedSequence(new A001617());
  private final DynamicIntArray mInv = new DynamicIntArray();
  {
    mInv.set(0, 1);
  }
  private int mN = -1;
  private int mM = 1;

  @Override
  public Z next() {
    final int bnd = 12 * ++mN + 18 * IntegerUtils.sqrt(mN) + 100;
    while (mM <= bnd) {
      final int g = mA.a(mM).intValueExact();
      if (mInv.get(g) == 0) {
        mInv.set(g, mM + 1);
      }
      ++mM;
    }
    return Z.valueOf(mInv.get(mN));
  }
}
