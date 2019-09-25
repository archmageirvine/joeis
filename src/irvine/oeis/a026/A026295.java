package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026295 <code>a(n) = T(2n,n-1)</code>, where T is the array in <code>A026268</code>.
 * @author Sean A. Irvine
 */
public class A026295 extends A026268 {

  private long mN = 0;

  @Override
  public Z next() {
    return get(2 * ++mN, mN - 1);
  }
}
