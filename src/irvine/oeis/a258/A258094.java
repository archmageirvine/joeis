package irvine.oeis.a258;

import irvine.math.z.Z;
import irvine.oeis.a105.A105559;

/**
 * A258094.
 * @author Sean A. Irvine
 */
public class A258094 extends A105559 {

  private long mN = -1;

  @Override
  public Z next() {
    final Z a = super.next();
    return ++mN == 1 ? Z.SEVEN : a;
  }
}

