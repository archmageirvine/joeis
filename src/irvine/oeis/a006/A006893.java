package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006893.
 * @author Sean A. Irvine
 */
public class A006893 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.add(3).multiply(mA).divide2();
    return mA;
  }
}
