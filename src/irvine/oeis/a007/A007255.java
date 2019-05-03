package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.a121.A121665;

/**
 * A007255 McKay-Thompson series of class <code>6B</code> for Monster.
 * @author Sean A. Irvine
 */
public class A007255 extends A121665 {

  private long mN = -1;

  @Override
  public Z next() {
    final Z a = super.next();
    return ++mN == 1 ? Z.ZERO : a;
  }
}

