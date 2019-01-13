package irvine.oeis.a134;

import irvine.math.z.Z;
import irvine.oeis.a131.A131123;

/**
 * A134785.
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

