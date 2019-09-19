package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026157 <code>a(n) = T(2n,n)</code>, where T is the array in <code>A026148</code>.
 * @author Sean A. Irvine
 */
public class A026157 extends A026148 {

  private long mN = -1;

  @Override
  public Z next() {
    return get(2 * ++mN, mN);
  }
}
