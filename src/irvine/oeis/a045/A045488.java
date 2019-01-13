package irvine.oeis.a045;

import irvine.math.z.Z;
import irvine.oeis.a105.A105559;

/**
 * A045488.
 * @author Sean A. Irvine
 */
public class A045488 extends A105559 {

  private long mN = -1;

  @Override
  public Z next() {
    final Z a = super.next();
    return ++mN == 1 ? Z.ONE : a;
  }
}

