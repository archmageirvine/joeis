package irvine.oeis.a134;

import irvine.math.z.Z;
import irvine.oeis.a131.A131123;

/**
 * A134785 McKay-Thompson series of class 8A for the Monster group with <code>a(0) = 2</code>.
 * @author Sean A. Irvine
 */
public class A134785 extends A131123 {

  private long mN = -1;

  @Override
  public Z next() {
    final Z a = super.next();
    return ++mN == 1 ? Z.TWO : a;
  }
}

