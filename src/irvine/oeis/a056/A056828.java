package irvine.oeis.a056;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a001.A001694;

/**
 * A056828 Numbers that are not the sum of at most three powerful (1) numbers.
 * @author Sean A. Irvine
 */
public class A056828 extends Sequence1 {

  private final MemorySequence mPowerful = MemorySequence.cachedSequence(new A001694());
  private final TreeSet<Z> mA = new TreeSet<>();
  private Z mN = Z.ZERO;
  private int mM = 0;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      while (mA.isEmpty() || mA.first().compareTo(mPowerful.a(mM)) >= 0) {
        final Z a = mPowerful.a(mM);
        mA.add(a);
        for (int k = 0; k <= mM; ++k) {
          final Z b = a.add(mPowerful.a(k));
          mA.add(b);
          for (int j = 0; j <= mM; ++j) {
            mA.add(b.add(mPowerful.a(j)));
          }
        }
        ++mM;
      }
      if (!mA.remove(mN)) {
        return mN;
      }
    }
  }
}
