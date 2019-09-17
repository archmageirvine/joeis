package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026114 <code>T(4n,n)</code>, where T is the array defined in <code>A026105</code>.
 * @author Sean A. Irvine
 */
public class A026114 extends A026105 {

  private long mN = -1;

  @Override
  public Z next() {
    return m(4 * ++mN, mN);
  }
}
