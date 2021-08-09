package irvine.oeis.a050;

import irvine.math.z.Z;

/**
 * A050148 a(n) = T(n,n-2), array T as in A050143.
 * @author Sean A. Irvine
 */
public class A050148 extends A050143 {

  private int mN = 1;

  @Override
  public Z next() {
    return get(++mN, mN - 2);
  }
}
