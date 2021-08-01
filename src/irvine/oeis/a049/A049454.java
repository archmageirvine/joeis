package irvine.oeis.a049;

import irvine.math.z.Z;
import irvine.oeis.a000.A000010;

/**
 * A049454 a(n) = 1 + Sum_{i=1..n} phi(i)^2.
 * @author Sean A. Irvine
 */
public class A049454 extends A000010 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.add(super.next().square());
    return mA;
  }
}
