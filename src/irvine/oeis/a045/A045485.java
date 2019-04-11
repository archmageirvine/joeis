package irvine.oeis.a045;

import irvine.math.z.Z;
import irvine.oeis.a121.A121665;

/**
 * A045485 McKay-Thompson series of class 6B for Monster with <code>a(0) = 7</code>.
 * @author Sean A. Irvine
 */
public class A045485 extends A121665 {

  private long mN = -1;

  @Override
  public Z next() {
    final Z a = super.next();
    return ++mN == 1 ? Z.SEVEN : a;
  }
}

