package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027172 <code>(1/2)*T(2n,n)</code>, T given by <code>A027170</code>.
 * @author Sean A. Irvine
 */
public class A027172 extends A027170 {

  private long mN = 0;

  @Override
  public Z next() {
    return t(2 * ++mN, mN).divide2();
  }
}
