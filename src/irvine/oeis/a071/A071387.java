package irvine.oeis.a071;

import irvine.math.z.InverseEuler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.DynamicLongArray;

/**
 * A071387 Smallest number k for which the set of solutions to phi(x) = k has 2n-1 entries.
 * @author Sean A. Irvine
 */
public class A071387 extends Sequence1 {

  private final DynamicLongArray mFirsts = new DynamicLongArray();
  private int mN = -1;
  private long mM = 1;

  @Override
  public Z next() {
    mN += 2;
    if (mN == 1) {
      return Z.ZERO;
    }
    while (mFirsts.get(mN) == 0) {
      final int s = InverseEuler.inversePhi(Z.valueOf(++mM)).size();
      if (mFirsts.get(s) == 0) {
        mFirsts.set(s, mM);
      }
    }
    return Z.valueOf(mFirsts.get(mN));
  }
}
