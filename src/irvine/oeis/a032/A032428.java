package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A032428 Coefficients of Jacobi elliptic function <code>c(5,m)</code>.
 * @author Sean A. Irvine
 */
public class A032428 implements Sequence {

  // After Franzen paper

  private static final Z Z24 = Z.valueOf(24);
  private static final Z Z120 = Z.valueOf(120);

  private int mN = j() - 1;

  protected int j() {
    return 5;
  }

  private Z beta(final int n, final int j) {
    return Z.valueOf(2 * (n - j) + 3).shiftLeft(2);
  }

  private long delta(final int a, final int b) {
    return a == b ? 1 : 0;
  }

  private Z p(final int p, final int n, final int j) {
    final Z beta = beta(n, j);
    switch (p) {
      case 0:
        return Z.ONE;
      case 1:
        return beta.subtract(delta(j, 1));
      case 2:
        return beta.pow(2)
          .add(beta.multiply(1 - delta(j, 2)).multiply2())
          .subtract(2 * (4 * j + 18 - delta(j, 2)));
      case 3:
        return beta.pow(3)
          .add(beta.pow(2).multiply(3).multiply(2 - delta(j, 3)))
          .subtract(beta.multiply(4).multiply(6 * j + 25))
          .subtract(6 * (delta(j, 4) - 29 * delta(j, 3)));
      case 4:
        return beta.pow(4)
          .add(beta.pow(3).multiply(4).multiply(3 - delta(j, 4)))
          .subtract(beta.pow(2).multiply(4).multiply(12 * j + 43 + 3 * delta(j, 4)))
          .subtract(beta.multiply(8).multiply(12 * j + 51 + 3 * delta(j, 5) - 98 * delta(j, 4)))
          .add(Z24.multiply(8 * j * j + 74 * j + 147 - 33 * delta(j, 4)));
      case 5:
        return beta.pow(5)
          .add(beta.pow(4).multiply(5).multiply(4 - delta(j, 5)))
          .subtract(beta.pow(3).multiply(20).multiply(4 * j + 11 + 2 * delta(j, 5)))
          .subtract(beta.pow(2).multiply(20).multiply(24 * j + 94 + 3 * delta(j, 6) - 106 * delta(j, 5)))
          .add(beta.multiply(8).multiply(120 * j * j + 1030 * j + 1863 - 15 * delta(j, 6) + 5 * delta(j, 5)))
          .subtract(Z120.multiply(delta(j, 7) - 42 * delta(j, 6) + 680 * delta(j, 5)));
      default:
        throw new UnsupportedOperationException();
    }
  }

  @Override
  public Z next() {
    final int m = 2 * ++mN + 1;
    Z sum = Z.ZERO;
    long pf = 1;
    for (int p = 0; p <= j(); ++p) {
      if (p > 1) {
        pf *= p;
      }
      final Z t = p(p, mN, j()).multiply(Z.valueOf(2 * (j() - p) + 1).pow(m)).divide(pf);
      sum = sum.signedAdd((p & 1) == 0, t);
    }
    return sum.shiftRight(4 * j());
  }

}
