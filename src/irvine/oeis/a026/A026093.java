package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026093 T(2n,n+1), where T is the array defined in A026082.
 * @author Sean A. Irvine
 */
public class A026093 extends A026082 {

  private long mN = 0;

  @Override
  public Z next() {
    return get(2 * ++mN, mN + 1);
  }
}

