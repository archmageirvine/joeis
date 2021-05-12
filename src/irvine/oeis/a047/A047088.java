package irvine.oeis.a047;

import irvine.math.z.Z;

/**
 * A047088 T(2n+1,n+2), array T as in A047080.
 * @author Sean A. Irvine
 */
public class A047088 extends A047080 {

  private long mN = 0;

  @Override
  public Z next() {
    return get(2 * ++mN + 1, mN + 2);
  }
}
