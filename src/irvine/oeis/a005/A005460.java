package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005460.
 * @author Sean A. Irvine
 */
public class A005460 implements Sequence {

  private long mN = -1;
  private Z mF = Z.TWO;

  @Override
  public Z next() {
    ++mN;
    mF = mF.multiply(mN + 3);
    return mF.multiply(3 * mN + 4).divide(24);
  }
}
