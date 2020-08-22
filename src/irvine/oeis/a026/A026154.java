package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026154 a(n) = T(n,n-3), where T is the array in A026148.
 * @author Sean A. Irvine
 */
public class A026154 extends A026148 {

  private long mN = 2;

  @Override
  public Z next() {
    return get(++mN, mN - 3);
  }
}
