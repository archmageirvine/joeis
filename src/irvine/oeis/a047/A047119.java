package irvine.oeis.a047;

import irvine.math.z.Z;

/**
 * A047119 T(2n,n), array T as in A047110.
 * @author Sean A. Irvine
 */
public class A047119 extends A047110 {

  private long mN = -1;

  @Override
  public Z next() {
    return get(2 * ++mN, mN);
  }
}
