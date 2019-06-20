package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a001.A001017;

/**
 * A024097 <code>a(n) = 8^n - n^9</code>.
 * @author Sean A. Irvine
 */
public class A024097 extends A001017 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.multiply(8);
    return mA.subtract(super.next());
  }
}
