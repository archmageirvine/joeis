package irvine.oeis.a082;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A082042 <code>(n^2+1)n!</code>.
 * @author Sean A. Irvine
 */
public class A082042 implements Sequence {

  private Z mF = Z.ONE;
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN > 1) {
      mF = mF.multiply(mN);
    }
    return mF.multiply(Z.valueOf(mN).square().add(1));
  }
}

