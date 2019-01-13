package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A014609.
 * @author Sean A. Irvine
 */
public class A014609 implements Sequence {

  private Z mA = null;
  private long mN = 0;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.multiply(++mN).multiply(5 * mN - 4).multiply(5 * mN - 3).multiply(5 * mN - 2).multiply(5 * mN - 1).divide(24);
    return mA;
  }
}
