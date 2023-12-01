package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067039 The tower function n^{(n-1)!}.
 * @author Sean A. Irvine
 */
public class A067039 extends Sequence1 {

  private Z mF = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    if (++mN > 2) {
      mF = mF.multiply(mN - 1);
    }
    return Z.valueOf(mN).pow(mF);
  }
}

