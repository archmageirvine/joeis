package irvine.oeis.a047;

import irvine.math.z.Z;

/**
 * A047087 T(2n,n+1), array T as in A047080.
 * @author Sean A. Irvine
 */
public class A047087 extends A047080 {

  private long mN = 0;

  @Override
  public Z next() {
    return get(2 * ++mN, mN + 1);
  }
}
