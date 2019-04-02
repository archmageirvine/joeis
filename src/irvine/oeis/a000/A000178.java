package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000178 Superfactorials: product of first n factorials.
 * @author Sean A. Irvine
 */
public class A000178 implements Sequence {

  private long mN = -1;
  private Z mF = Z.ONE;
  private Z mP = Z.ONE;

  @Override
  public Z next() {
    if (++mN < 2) {
      return Z.ONE;
    }
    mF = mF.multiply(mN);
    mP = mP.multiply(mF);
    return mP;
  }
}

