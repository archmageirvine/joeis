package irvine.oeis.a048;

import irvine.math.z.Z;

/**
 * A048734 a(n) = Xpower(n,5);.
 * @author Sean A. Irvine
 */
public class A048734 extends A048723 {

  private long mN = -1;

  @Override
  public Z next() {
    return power(++mN, 5);
  }
}
