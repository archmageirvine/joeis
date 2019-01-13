package irvine.oeis.a045;

import irvine.math.z.Z;
import irvine.oeis.a121.A121667;

/**
 * A045487.
 * @author Sean A. Irvine
 */
public class A045487 extends A121667 {

  private long mN = -1;

  @Override
  public Z next() {
    final Z a = super.next();
    return ++mN == 1 ? Z.ONE : a;
  }
}

