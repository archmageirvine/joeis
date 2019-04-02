package irvine.oeis.a005;

import irvine.math.z.Z;

/**
 * A005615 Number of fanout-free Boolean functions of n variables using And, Or, Not and Majority gates.
 * @author Sean A. Irvine
 */
public class A005615 extends A005640 {

  private int mN = -1;

  @Override
  protected Z switchA(final int k, final int n) {
    switch (k) {
      case 0:
        return o(n);
      case 1:
        return m(n);
      case 2:
        return n(n);
      default:
        throw new RuntimeException();
    }
  }

  @Override
  protected Z switchM(final int k, final int n) {
    switch (k) {
      case 0:
        return o(n);
      case 1:
        return m(n);
      case 2:
        return n(n);
      case 3:
        return a(n);
      default:
        throw new RuntimeException();
    }
  }

  @Override
  protected int operations() {
    return 4; // A, E, O, N
  }

  @Override
  public Z next() {
    return ++mN == 0 ? Z.TWO : a(mN).multiply2().add(m(mN)).add(n(mN));
  }
}

