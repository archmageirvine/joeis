package irvine.oeis.a047;

import irvine.math.z.Z;

/**
 * A047113 T(n,n-1), array T as in A047110.
 * @author Sean A. Irvine
 */
public class A047113 extends A047110 {

  private long mN = 0;

  @Override
  public Z next() {
    return get(++mN, mN - 1);
  }
}
