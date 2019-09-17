package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026117 <code>T(n,[ n/2 ])</code>, where T is the array defined in <code>A026105</code>.
 * @author Sean A. Irvine
 */
public class A026117 extends A026105 {

  private long mN = -1;

  @Override
  public Z next() {
    return m(++mN, mN / 2);
  }
}
