package irvine.oeis.a128;

import irvine.math.z.Z;
import irvine.oeis.a105.A105559;

/**
 * A128633 McKay-Thompson series of class 6E for the Monster group with a(0) = 4.
 * @author Sean A. Irvine
 */
public class A128633 extends A105559 {

  private long mN = -1;

  @Override
  public Z next() {
    final Z a = super.next();
    return ++mN == 1 ? Z.FOUR : a;
  }
}

