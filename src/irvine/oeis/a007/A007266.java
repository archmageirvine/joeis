package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.a131.A131985;

/**
 * A007266 McKay-Thompson series of class <code>9A</code> for Monster.
 * @author Sean A. Irvine
 */
public class A007266 extends A131985 {

  private long mN = -1;

  @Override
  public Z next() {
    final Z a = super.next();
    return ++mN == 1 ? Z.ZERO : a;
  }
}

