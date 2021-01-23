package irvine.oeis.a028;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A028301 a(n+1) = a(n)^2 + prime(n).
 * @author Sean A. Irvine
 */
public class A028301 extends A000040 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.square().add(super.next());
    return mA;
  }
}

