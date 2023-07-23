package irvine.oeis.a003;

import irvine.math.z.Z;

/**
 * A003456 Number of nonequivalent dissections of an n-gon by nonintersecting diagonals rooted at a cell up to rotation and reflection.
 * @author Sean A. Irvine
 */
public class A003456 extends A003447 {

  {
    setOffset(3);
  }

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z s = Z.ZERO;
    for (int k = 1; k <= mN; ++k) {
      s = s.add(smallF(k, mN + 2).coeff(mN + 2).toZ());
    }
    return s;
  }
}

