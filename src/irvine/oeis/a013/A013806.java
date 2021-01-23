package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013806 a(n) = 17^(4*n+1).
 * @author Sean A. Irvine
 */
public class A013806 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(17) : mA.multiply(83521);
    return mA;
  }
}
