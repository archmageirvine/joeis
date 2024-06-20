package irvine.oeis.a070;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.DynamicLongArray;

/**
 * A070818 Smallest argument m such that commutator[phi(m), gpf(m)] = 2n-1, where phi(m) = A000010(m) and gpf(m) = A006530(m), the largest prime factor of m.
 * @author Sean A. Irvine
 */
public class A070818 extends Sequence1 {

  private final DynamicLongArray mFirsts = new DynamicLongArray();
  private int mN = -1;
  private long mM = 0;

  @Override
  public Z next() {
    mN += 2;
    while (mFirsts.get(mN) == 0) {
      ++mM;
      final long t = Functions.PHI.l(Functions.GPF.l(mM)) - Functions.GPF.l(Functions.PHI.l(mM));
      if (t >= 0 && t < Integer.MAX_VALUE && mFirsts.get((int) t) == 0) {
        mFirsts.set((int) t, mM);
      }
    }
    return Z.valueOf(mFirsts.get(mN));
  }
}
