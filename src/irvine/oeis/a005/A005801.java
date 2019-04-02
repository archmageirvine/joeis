package irvine.oeis.a005;

import java.util.ArrayList;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.a000.A000182;

/**
 * A005801 Generalized tangent numbers of type 3^(2n+1).
 * @author Sean A. Irvine
 */
public class A005801 extends A000182 {

  private Z mA = Z.THREE;
  private int mN = -1;
  private final ArrayList<Z> mA182 = new ArrayList<>();
  {
    mA182.add(Z.ZERO);
  }

  private Z a182(final int n) {
    while (n >= mA182.size()) {
      mA182.add(super.next());
    }
    return mA182.get(n);
  }

  @Override
  public Z next() {
    if (++mN > 0) {
      mA = mA.multiply(9);
    }
    Z sum = Z.ZERO;
    for (int k = 0; k <= 2 * mN + 1; ++k) {
      sum = sum.signedAdd((k & 1) == 1, Binomial.binomial(2 * mN + 1, k).multiply(a182(mN + k + 1)).shiftRight(k));
    }
    return sum.divide(mA);
  }
}
