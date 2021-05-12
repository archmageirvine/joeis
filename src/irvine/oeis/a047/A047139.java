package irvine.oeis.a047;

import irvine.math.z.Z;

/**
 * A047139 T(2n,n), array T as in A047130.
 * @author Sean A. Irvine
 */
public class A047139 extends A047130 {

  private long mN = -1;

  @Override
  public Z next() {
    return get(2 * ++mN, mN);
  }
}
