package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A046967 a(1) = 2, a(n) = a(n-1)^prime(n) for n &gt; 1.
 * @author Sean A. Irvine
 */
public class A046967 extends A000040 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? super.next() : mA.pow(super.next());
    return mA;
  }
}
