package irvine.oeis.a047;

import irvine.math.z.Z;

/**
 * A047112 T(n,n), array T as in A047110.
 * @author Sean A. Irvine
 */
public class A047112 extends A047110 {

  private long mN = -1;

  @Override
  public Z next() {
    return get(++mN, mN);
  }
}
