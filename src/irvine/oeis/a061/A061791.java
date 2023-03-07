package irvine.oeis.a061;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A061715.
 * @author Sean A. Irvine
 */
public class A061791 extends Sequence1 {

  private final HashSet<Z> mSums = new HashSet<>();
  private long mN = 0;

  @Override
  public Z next() {
    final Z s = Z.valueOf(++mN).pow(3);
    mSums.add(s.multiply2());
    for (long q = 1; q < mN; ++q) {
      mSums.add(s.add(Z.valueOf(q).pow(3)));
    }
    return Z.valueOf(mSums.size());
  }
}

