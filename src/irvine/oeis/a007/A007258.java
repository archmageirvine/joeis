package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.a105.A105559;

/**
 * A007258.
 * @author Sean A. Irvine
 */
public class A007258 extends A105559 {

  private long mN = -1;

  @Override
  public Z next() {
    final Z a = super.next();
    return ++mN == 1 ? Z.ZERO : a;
  }
}

