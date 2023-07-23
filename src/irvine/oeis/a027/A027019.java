package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027019 a(n) = A027011(2n+1, n+4).
 * @author Sean A. Irvine
 */
public class A027019 extends A027011 {

  {
    setOffset(3);
  }

  private long mN = 2;

  @Override
  public Z next() {
    return ++mN == 3 ? Z.ONE : t(2 * mN + 1, mN + 4);
  }
}
