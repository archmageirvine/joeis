package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007680 <code>a(n) = (2n+1)*n!</code>.
 * @author Sean A. Irvine
 */
public class A007680 implements Sequence {

  private long mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 1) {
      mF = mF.multiply(mN);
    }
    return mF.multiply(2 * mN + 1);
  }
}
