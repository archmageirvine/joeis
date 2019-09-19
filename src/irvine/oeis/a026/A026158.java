package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026158 <code>a(n) = T(3n,n)</code>, where T is the array in <code>A026148</code>.
 * @author Sean A. Irvine
 */
public class A026158 extends A026148 {

  private long mN = -1;

  @Override
  public Z next() {
    return get(3 * ++mN, mN);
  }
}
