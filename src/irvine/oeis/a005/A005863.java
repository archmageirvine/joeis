package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.a004.A004035;

/**
 * A005863 The coding-theoretic function A(n,14,11).
 * @author Sean A. Irvine
 */
public class A005863 extends A004035 {

  private int mN = 10;

  @Override
  public Z next() {
    return Z.valueOf(a(++mN, 14, 11));
  }
}
