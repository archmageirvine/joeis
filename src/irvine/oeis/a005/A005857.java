package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.a004.A004035;

/**
 * A005857 The coding-theoretic function A(n,12,7).
 * @author Sean A. Irvine
 */
public class A005857 extends A004035 {

  private int mN = 6;

  @Override
  public Z next() {
    return Z.valueOf(a(++mN, 12, 7));
  }
}
