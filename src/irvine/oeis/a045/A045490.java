package irvine.oeis.a045;

import irvine.math.z.Z;
import irvine.oeis.a131.A131123;

/**
 * A045490 McKay-Thompson series of class 8A for Monster.
 * @author Sean A. Irvine
 */
public class A045490 extends A131123 {

  private long mN = -1;

  @Override
  public Z next() {
    final Z a = super.next();
    return ++mN == 1 ? Z.FOUR : a;
  }
}

