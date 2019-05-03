package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.a121.A121667;

/**
 * A007257 McKay-Thompson series of class <code>6D</code> for Monster.
 * @author Sean A. Irvine
 */
public class A007257 extends A121667 {

  private long mN = -1;

  @Override
  public Z next() {
    final Z a = super.next();
    return ++mN == 1 ? Z.ZERO : a;
  }
}

