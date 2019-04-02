package irvine.oeis.a187;

import irvine.math.z.Z;

/**
 * A187147 McKay-Thompson series of class 12B for the Monster group with a(0) = -4.
 * @author Sean A. Irvine
 */
public class A187147 extends A187146 {

  private long mN = -1;

  @Override
  public Z next() {
    final Z a = super.next();
    return ++mN == 1 ? Z.valueOf(-4) : a;
  }
}

