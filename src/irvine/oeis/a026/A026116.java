package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026116 <code>T(2n,n+1)</code>, where T is the array defined in <code>A026105</code>.
 * @author Sean A. Irvine
 */
public class A026116 extends A026105 {

  private long mN = 0;

  @Override
  public Z next() {
    return m(2 * ++mN, mN + 1);
  }
}
