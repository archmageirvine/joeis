package irvine.oeis.a018;

import irvine.math.z.Z;

/**
 * A018929 Define {b(n)} by b(1) = 3, b(n) (n &gt;= 2) is smallest number such that b(1)^2 + ... + b(n)^2 = m^2 for some m and all b(i) are distinct. Sequence gives values of m^2.
 * @author Sean A. Irvine
 */
public class A018929 extends A018928 {

  private final A018930 mA = new A018930();
  {
    next(); // skip 0th
  }

  @Override
  public Z next() {
    return super.next().square().subtract(mA.next().square());
  }
}

