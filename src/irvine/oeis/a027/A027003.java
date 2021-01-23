package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027003 a(n) = A026998(2n, n+4).
 * @author Sean A. Irvine
 */
public class A027003 extends A027960 {

  private long mN = 6;

  @Override
  public Z next() {
    mN += 2;
    return get(mN, mN + 8);
  }
}
