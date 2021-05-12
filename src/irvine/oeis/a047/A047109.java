package irvine.oeis.a047;

import irvine.math.z.Z;

/**
 * A047109 T(2n,n), array T as in A047110.
 * @author Sean A. Irvine
 */
public class A047109 extends A047100 {

  private long mN = -1;

  @Override
  public Z next() {
    return get(2 * ++mN, mN);
  }
}
