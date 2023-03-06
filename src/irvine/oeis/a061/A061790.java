package irvine.oeis.a061;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A061715.
 * @author Sean A. Irvine
 */
public class A061790 extends Sequence1 {

  private final HashSet<Long> mSums = new HashSet<>();
  private long mN = 0;

  @Override
  public Z next() {
    final long s = ++mN * mN;
    mSums.add(2 * s);
    for (long q = 1; q < mN; ++q) {
      mSums.add(s + q * q);
    }
    return Z.valueOf(mN * (mN + 1) / 2 - mSums.size());
  }
}

