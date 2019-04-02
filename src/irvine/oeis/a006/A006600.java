package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006600 Total number of triangles visible in regular n-gon with all diagonals drawn.
 * @author Sean A. Irvine
 */
public class A006600 implements Sequence {

  // After T. D. Noe

  private long mN = 2;

  private boolean del(final long m, final long n) {
    return n % m == 0;
  }

  @Override
  public Z next() {
    ++mN;
    Z a = Z.valueOf(mN).add(18).multiply(mN).subtract(43).multiply(mN).add(60).multiply(mN).multiply(mN - 1).multiply(mN - 2).divide(720);
    if (del(2, mN)) {
      a = a.subtract(Z.valueOf(mN).multiply(mN - 2).multiply(mN - 7).divide(8));
    }
    if (del(4, mN)) {
      a = a.subtract(3 * mN / 4);
    }
    if (del(6, mN)) {
      a = a.subtract(Z.valueOf(18 * mN - 106).multiply(mN).divide(3));
    }
    if (del(12, mN)) {
      a = a.add(33 * mN);
    }
    if (del(18, mN)) {
      a = a.add(36 * mN);
    }
    if (del(24, mN)) {
      a = a.add(24 * mN);
    }
    if (del(30, mN)) {
      a = a.subtract(96 * mN);
    }
    if (del(42, mN)) {
      a = a.subtract(72 * mN);
    }
    if (del(60, mN)) {
      a = a.subtract(264 * mN);
    }
    if (del(84, mN)) {
      a = a.subtract(9 * mN);
    }
    if (del(90, mN)) {
      a = a.subtract(48 * mN);
    }
    if (del(120, mN)) {
      a = a.subtract(96 * mN);
    }
    if (del(210, mN)) {
      a = a.subtract(48 * mN);
    }
    return a;
  }
}

