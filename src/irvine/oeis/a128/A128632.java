package irvine.oeis.a128;

import irvine.math.z.Z;
import irvine.oeis.a105.A105559;

/**
 * A128632.
 * @author Sean A. Irvine
 */
public class A128632 extends A105559 {

  private long mN = -1;

  @Override
  public Z next() {
    final Z a = super.next();
    return ++mN == 1 ? Z.valueOf(-5) : a;
  }
}

