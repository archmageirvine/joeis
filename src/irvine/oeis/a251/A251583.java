package irvine.oeis.a251;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence0;

/**
 * A251583 a(n) = 3^(n-1) * (n+1)^(n-3) * (n+3).
 * <code>A251585  parm3  A251583  5  "16*n^3 + 87*n^2 + 172*n + 125"  a(n) = 5^(n-3) * (n+1)^(n-5) * (16*n^3 + 87*n^2 + 172*n + 125).  nonn,  0..312  nyi  _Paul D. Hanna_, Dec 06 2014</code>
 * @author Georg Fischer
 */
public class A251583 extends Sequence0 {

  private int mN;
  private int mBase;
  private Z[] mPoly;

  /** Construct the sequence. */
  public A251583() {
    this(3, "1*n^1 + 3");
  }

  /**
   * Generic constructor with parameters
   * @param base the base in the first factor
   * @param poly representation of the last factor
   */
  public A251583(final int base, final String poly) {
    mN = -1;
    mBase = base;
    mPoly = ZUtils.toZ(poly.replaceAll("\\*n(\\^\\d+)? *\\+ *", ","));
  }

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    Z nPow = Z.ONE;
    for (int k = mBase - 2; k >= 0; --k) {
      sum = sum.add(nPow.multiply(mPoly[k]));
      nPow = nPow.multiply(mN);
    }
    return new Q(mBase).pow(mN - (mBase - 2)).multiply(new Q(mN + 1).pow(mN - mBase)).multiply(sum).num();
  }
}
