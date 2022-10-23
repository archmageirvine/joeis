package irvine.oeis.a000;

import java.util.ArrayList;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A000307 Number of 4-level labeled rooted trees with n leaves.
 * @author Sean A. Irvine
 */
public class A000307 extends Sequence0 {

  private int mN = -1;
  private final A000258 mA258 = new A000258();
  private final ArrayList<Z> mL = new ArrayList<>();
  private final ArrayList<Z> mB = new ArrayList<>();

  private Z a258(final int n) {
    while (n >= mL.size()) {
      mL.add(mA258.next());
    }
    return mL.get(n);
  }

  private Z computeB(final int n) {
    if (n == 0) {
      return Z.ONE;
    } else {
      Z sum = Z.ZERO;
      for (int k = 1; k <= n; ++k) {
        sum = sum.add(a258(k).multiply(b(n - k)).multiply(Binomial.binomial(n - 1, k - 1)));
      }
      return sum;
    }
  }

  private Z b(final int n) {
    while (n >= mB.size()) {
      mB.add(computeB(mB.size()));
    }
    return mB.get(n);
  }

  @Override
  public Z next() {
    return b(++mN);
  }
}
