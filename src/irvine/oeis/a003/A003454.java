package irvine.oeis.a003;

import irvine.math.z.Z;

/**
 * A003454 Number of nonequivalent dissections of an n-gon by nonintersecting diagonals rooted at a cell up to rotation.
 * @author Sean A. Irvine
 */
public class A003454 extends A003442 {

  /** Construct the sequence. */
  public A003454() {
    super(3);
  }

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z s = Z.ZERO;
    for (int k = 1; k <= mN; ++k) {
      s = s.add(f(k, mN + 2).coeff(mN + 2).toZ());
    }
    return s;
  }
}

