package irvine.oeis.a061;

import java.util.HashSet;

import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A061715.
 * @author Sean A. Irvine
 */
public class A061795 extends Sequence1 {

  private final HashSet<Long> mSums = new HashSet<>();
  private int mPhiLimit = 1000;
  private int mN = 0;
  private Euler mPhi = new Euler(mPhiLimit);

  @Override
  public Z next() {
    if (++mN >= mPhiLimit) {
      mPhiLimit *= 2;
      mPhi = new Euler(mPhiLimit);
    }
    final long s = mPhi.phi(mN);
    mSums.add(2L * s);
    for (int q = 1; q < mN; ++q) {
      mSums.add(s + mPhi.phi(q));
    }
    return Z.valueOf(mSums.size());
  }
}

