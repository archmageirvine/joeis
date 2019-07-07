package irvine.oeis.a024;

import java.util.ArrayList;

import irvine.math.z.Z;
import irvine.oeis.a023.A023532;

/**
 * A024366 <code>a(n) = s(1)s(n) + s(2)s(n-1) + ... + s(k)s(n+1-k)</code>, where k <code>= [ (n+1)/2 ], s = A023532</code>.
 * @author Sean A. Irvine
 */
public class A024366 extends A023532 {

  private final ArrayList<Z> mA = new ArrayList<>();
  private int mN = 0;
  {
    super.next();
  }

  @Override
  public Z next() {
    ++mN;
    mA.add(super.next());
    Z sum = Z.ZERO;
    for (int k = 1; k <= (mN + 1) / 2; ++k) {
      sum = sum.add(mA.get(mN - k).multiply(mA.get(k - 1)));
    }
    return sum;
  }
}

