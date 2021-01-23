package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027145 a(n) = A027144(2n, n).
 * @author Sean A. Irvine
 */
public class A027145 extends A027144 {

  private long mN = -1;

  @Override
  public Z next() {
    return get(2 * ++mN, mN);
  }
}
