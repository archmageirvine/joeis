package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.a004.A004035;

/**
 * A005855 The coding-theoretic function A(n,10,7).
 * @author Sean A. Irvine
 */
public class A005855 extends A004035 {

  private int mN = 6;

  @Override
  public Z next() {
    return Z.valueOf(a(++mN, 10, 7));
  }
}
