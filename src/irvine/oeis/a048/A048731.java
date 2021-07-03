package irvine.oeis.a048;

import irvine.math.z.Z;

/**
 * A048731 Diagonal of A048723, a(n) = Xpower(n,n).
 * @author Sean A. Irvine
 */
public class A048731 extends A048723 {

  private long mN = -1;

  @Override
  public Z next() {
    return power(++mN, mN);
  }
}
