package irvine.oeis.a051;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A051374 Numbers not of form n + sum of digits of n^2.
 * @author Sean A. Irvine
 */
public class A051374 extends Sequence1 {

  private final TreeSet<Z> mExcluded = new TreeSet<>();
  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      mExcluded.add(mN.add(ZUtils.digitSum(mN.square())));
      if (!mExcluded.remove(mN)) {
        return mN;
      }
    }
  }
}

