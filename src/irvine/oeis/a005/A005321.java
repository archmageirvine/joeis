package irvine.oeis.a005;

import java.util.ArrayList;
import java.util.List;

import irvine.math.z.Binomial;
import irvine.math.z.Z;

/**
 * A005321 Upper triangular <code>n X n (0,1)-matrices</code> with no zero rows or columns.
 * @author Sean A. Irvine
 */
public class A005321 extends A005327 {

  private final List<Z> mA = new ArrayList<>();
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    mA.add(super.next());
    Z sum = Z.ZERO;
    for (int k = 0; k <= mN; ++k) {
      sum = sum.add(Binomial.binomial(mN, k).multiply(mA.get(k)));
    }
    return sum;
  }
}
