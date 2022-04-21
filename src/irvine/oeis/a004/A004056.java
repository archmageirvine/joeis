package irvine.oeis.a004;

import irvine.math.z.Z;

/**
 * A004056 The coding-theoretic function A(n,14,12).
 * @author Sean A. Irvine
 */
public class A004056 extends A004035 {

  private int mN = 11;

  @Override
  public Z next() {
    return Z.valueOf(a(++mN, 14, 12));
  }
}
