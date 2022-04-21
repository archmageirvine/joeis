package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.a004.A004035;

/**
 * A005854 The coding-theoretic function A(n,10,6).
 * @author Sean A. Irvine
 */
public class A005854 extends A004035 {

  private int mN = 5;

  @Override
  public Z next() {
    return Z.valueOf(a(++mN, 10, 6));
  }
}
