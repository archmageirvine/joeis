package irvine.oeis.a059;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A059406 a(n) = a(n-1)*(3a(n-1) + 1)/2 with a(1) = 1.
 * @author Sean A. Irvine
 */
public class A059406 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.multiply(mA.multiply(3).add(1)).divide2();
    return mA;
  }
}
