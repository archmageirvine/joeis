package irvine.oeis.a001;

import java.util.ArrayList;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.a000.A000254;

/**
 * A001706 Generalized Stirling numbers.
 * @author Sean A. Irvine
 */
public class A001706 extends A000254 {

  private final ArrayList<Z> mA254 = new ArrayList<>();
  {
    mA254.add(super.next());
    mA254.add(super.next());
  }

  @Override
  public Z next() {
    mA254.add(super.next());
    Z s = Z.ZERO;
    final int n = (int) mN;
    for (int k = 0; k <= n; ++k) {
      s = s.add(Binomial.binomial(mN, k).multiply(mA254.get(k)).multiply(mA254.get(n - k)));
    }
    return s.divide2();
  }
}
