package irvine.oeis.a045;

import irvine.math.z.Z;
import irvine.oeis.a131.A131985;

/**
 * A045491 McKay-Thompson series of class 9A for the Monster group with <code>a(0) = 3</code>.
 * @author Sean A. Irvine
 */
public class A045491 extends A131985 {

  private long mN = -1;

  @Override
  public Z next() {
    final Z a = super.next();
    return ++mN == 1 ? Z.THREE : a;
  }
}

