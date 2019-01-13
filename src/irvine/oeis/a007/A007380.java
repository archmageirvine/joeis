package irvine.oeis.a007;

import irvine.math.z.Z;

/**
 * A007380.
 * @author Sean A. Irvine
 */
public class A007380 extends A007381 {

  private long mN = 7;

  @Override
  public Z next() {
    return t(2, 7, ++mN);
  }
}
