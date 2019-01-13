package irvine.oeis.a045;

import irvine.math.z.Z;
import irvine.oeis.a131.A131985;

/**
 * A045491.
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

