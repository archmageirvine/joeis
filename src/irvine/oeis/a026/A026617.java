package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026617 a(n) = A026615(2*n, n-1).
 * @author Sean A. Irvine
 */
public class A026617 extends A026615 {

  {
    setOffset(1);
  }

  private long mN = 0;

  @Override
  public Z next() {
    return get(2 * ++mN, mN - 1);
  }
}
