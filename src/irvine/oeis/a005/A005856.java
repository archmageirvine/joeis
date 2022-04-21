package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.a004.A004035;

/**
 * A005856 The coding-theoretic function A(n,10,8).
 * @author Sean A. Irvine
 */
public class A005856 extends A004035 {

  private int mN = 7;

  @Override
  public Z next() {
    return Z.valueOf(a(++mN, 10, 8));
  }
}
