package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026154 <code>a(n) = T(n,n-3)</code>, where T is the array in <code>A026148</code>.
 * @author Sean A. Irvine
 */
public class A026154 extends A026148 {

  private long mN = 2;

  @Override
  public Z next() {
    return get(++mN, mN - 3);
  }
}
