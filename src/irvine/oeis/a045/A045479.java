package irvine.oeis.a045;

import irvine.math.z.Z;
import irvine.oeis.a007.A007191;

/**
 * A045479 McKay-Thompson series of class <code>2B</code> for the Monster group with <code>a(0) = -8</code>.
 * @author Sean A. Irvine
 */
public class A045479 extends A007191 {

  private long mN = -1;

  @Override
  public Z next() {
    final Z a = super.next();
    return ++mN == 1 ? Z.valueOf(-8) : a;
  }
}

