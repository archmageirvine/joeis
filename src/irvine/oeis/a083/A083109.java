package irvine.oeis.a083;

import irvine.math.z.Z;

/**
 * A083109 a(n) = (A083108(n) - 1)/n.
 * @author Sean A. Irvine
 */
public class A083109 extends A083108 {

  private long mN = 0;

  @Override
  public Z next() {
    return super.next().subtract(1).divide(++mN);
  }
}

