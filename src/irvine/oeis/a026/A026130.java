package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026130 <code>T(4n,n)</code>, where T is the array in <code>A026120</code>.
 * @author Sean A. Irvine
 */
public class A026130 extends A026120 {

  private long mN = -1;

  @Override
  public Z next() {
    return u(4 * ++mN, mN - 1);
  }
}
