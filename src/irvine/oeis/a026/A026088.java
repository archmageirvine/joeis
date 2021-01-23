package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026088 a(n) = T(2n-1,n), where T is the array defined in A026082.
 * @author Sean A. Irvine
 */
public class A026088 extends A026082 {

  private long mN = 0;

  @Override
  public Z next() {
    return get(2 * ++mN - 1, mN);
  }
}

