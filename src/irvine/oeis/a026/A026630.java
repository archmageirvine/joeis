package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026630 a(n) = A026626(2*n-1, n-1).
 * @author Sean A. Irvine
 */
public class A026630 extends A026626 {

  {
    setOffset(1);
  }

  private long mN = 0;

  @Override
  public Z next() {
    return get(2 * ++mN - 1, mN - 1);
  }
}
