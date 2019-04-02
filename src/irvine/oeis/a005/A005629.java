package irvine.oeis.a005;

import irvine.math.z.Z;

/**
 * A005629 Number of achiral trees with n nodes.
 * @author Sean A. Irvine
 */
public class A005629 extends A005627 {

  private int mN = 0;
  {
    super.next();
  }

  private Z s2(final int n) {
    return (n & 1) == 0 ? getS(n / 2) : Z.ZERO;
  }

  private Z s4(final int n) {
    return (n & 3) == 0 ? getS(n / 4) : Z.ZERO;
  }

  @Override
  public Z next() {
    ++mN;
    return super.next().add(s2(mN)).add(s4(mN - 1)).divide2();
  }
}
