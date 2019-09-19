package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026156 <code>a(n) = T(2n-1,n)</code>, where T is the array in <code>A026148</code>.
 * @author Sean A. Irvine
 */
public class A026156 extends A026148 {

  private long mN = 0;

  @Override
  public Z next() {
    return get(2 * ++mN - 1, mN);
  }
}
