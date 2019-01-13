package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001564.
 * @author Sean A. Irvine
 */
public class A001564 implements Sequence {

  private long mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 1) {
      mF = mF.multiply(mN);
    }
    return mF.multiply(Z.valueOf(mN).multiply(mN).add(mN + 1));
  }
}
