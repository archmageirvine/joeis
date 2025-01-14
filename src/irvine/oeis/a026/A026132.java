package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026132 a(n) = A026120(2n,n+1).
 * @author Sean A. Irvine
 */
public class A026132 extends A026120 {

  {
    setOffset(1);
  }

  private long mN = 0;

  @Override
  public Z next() {
    return u(2 * ++mN, mN);
  }
}
