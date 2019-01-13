package irvine.oeis.a005;

import irvine.math.z.Z;

/**
 * A005617.
 * @author Sean A. Irvine
 */
public class A005617 extends A005616 {

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
      case 3:
        return e(n);
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
      case 4:
        return e(n);
      default:
        throw new RuntimeException();
    }
  }

  @Override
  protected Z switchE(final int k, final int n) {
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
    return 5;
  }

  @Override
  public Z next() {
    return ++mN == 0 ? Z.TWO : a(mN).multiply2().add(e(mN)).add(m(mN)).add(n(mN));
  }
}

