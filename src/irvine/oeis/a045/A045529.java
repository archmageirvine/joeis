package irvine.oeis.a045;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A045529 a(n+1) = 5*a(n)^3 - 3*a(n).
 * @author Sean A. Irvine
 */
public class A045529 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.pow(3).multiply(5).subtract(mA.multiply(3));
    return mA;
  }
}
