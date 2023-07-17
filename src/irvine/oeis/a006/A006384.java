package irvine.oeis.a006;

import irvine.math.z.Binomial;
import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A006384 Number of planar maps with n edges.
 * @author Sean A. Irvine
 */
public class A006384 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A006384(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A006384() {
    super(0);
  }

  private int mN = -1;

  private Z q(final int n) {
    if ((mN & 1) == 0) {
      final int m = (n - 2) / 2;
      return Z.THREE.pow(m).multiply(Binomial.binomial(n - 2, m)).multiply((n - 1L) * n).shiftLeft(2).divide((n + 2L) * n);
    } else {
      final int m = (n - 1) / 2;
      return Z.THREE.pow(m).multiply(Binomial.binomial(n - 1, m)).multiply(n).shiftLeft(2).divide(n + 1);
    }
  }

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    Z s = Z.ZERO;
    Z three = Z.ONE;
    for (int k = 1; k < mN; ++k) {
      three = three.multiply(Z.THREE);
      if (mN % k == 0) {
        s = s.add(three.multiply(Euler.phiAsLong(mN / k)).multiply(Binomial.binomial(2 * k, k)));
      }
    }
    s = s.add(three.multiply(Z.THREE).multiply(Binomial.binomial(2 * mN, mN)).multiply2().divide((mN + 1L) * (mN + 2L)));
    s = s.add(q(mN));
    return s.divide(2L * mN);
  }
}
