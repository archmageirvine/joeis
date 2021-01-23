package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026152 a(n) = T(n,n-1), where T is the array in A026148.
 * @author Sean A. Irvine
 */
public class A026152 extends A026148 {

  private long mN = 1;

  @Override
  public Z next() {
    return get(++mN, mN - 1);
  }
}
