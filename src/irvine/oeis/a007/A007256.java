package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.a121.A121666;

/**
 * A007256.
 * @author Sean A. Irvine
 */
public class A007256 extends A121666 {

  private long mN = -1;

  @Override
  public Z next() {
    final Z a = super.next();
    return ++mN == 1 ? Z.ZERO : a;
  }
}

