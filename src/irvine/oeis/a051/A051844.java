package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A051844 Least common multiple of {2^k + 1, k=0..n}.
 * @author Sean A. Irvine
 */
public class A051844 implements Sequence {

  private int mN = -1;
  private Z mLcm = Z.ONE;

  @Override
  public Z next() {
    mLcm = mLcm.lcm(Z.ONE.shiftLeft(++mN).add(1));
    return mLcm;
  }
}

