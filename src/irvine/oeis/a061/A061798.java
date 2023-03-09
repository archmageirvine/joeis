package irvine.oeis.a061;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A061798 Number of sums i^3 + j^3 that occur more than once for 1&lt;=i&lt;=j&lt;=n.
 * @author Sean A. Irvine
 */
public class A061798 extends Sequence1 {

  private final HashSet<Z> mSums = new HashSet<>();
  private long mN = 0;

  @Override
  public Z next() {
    final Z s = Z.valueOf(++mN).pow(3);
    mSums.add(s.multiply2());
    for (long q = 1; q < mN; ++q) {
      mSums.add(s.add(Z.valueOf(q).pow(3)));
    }
    return Z.valueOf(mN * (mN + 1) / 2 - mSums.size());
  }
}

