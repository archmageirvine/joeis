package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.a004.A004035;

/**
 * A005851 The coding-theoretic function A(n,8,5).
 * @author Sean A. Irvine
 */
public class A005851 extends A004035 {

  private int mN = 4;

  @Override
  public Z next() {
    return Z.valueOf(a(++mN, 8, 5));
  }
}
