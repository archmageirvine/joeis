package irvine.oeis.a004;

import irvine.math.z.Z;

/**
 * A004037 The coding-theoretic function A(n,6,4).
 * @author Sean A. Irvine
 */
public class A004037 extends A004035 {

  private int mN = 3;

  @Override
  public Z next() {
    return Z.valueOf(a(++mN, 6, 4));
  }
}
