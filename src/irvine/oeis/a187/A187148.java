package irvine.oeis.a187;

import irvine.math.z.Z;

/**
 * A187148 McKay-Thompson series of class <code>12B</code> for the Monster group with <code>a(0) = -3</code>.
 * @author Sean A. Irvine
 */
public class A187148 extends A187146 {

  private long mN = -1;

  @Override
  public Z next() {
    final Z a = super.next();
    return ++mN == 1 ? Z.valueOf(-3) : a;
  }
}

