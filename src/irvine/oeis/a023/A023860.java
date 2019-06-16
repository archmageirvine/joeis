package irvine.oeis.a023;

import java.util.ArrayList;

import irvine.math.z.Z;
import irvine.oeis.a000.A000045;

/**
 * A023860 <code>a(n) = 1*t(n) + 2*t(n-1) + ... + k*t(n+1-k)</code>, where <code>k=floor((n+1)/2), t = A000045</code> (Fibonacci numbers).
 * @author Sean A. Irvine
 */
public class A023860 extends A000045 {

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
      sum = sum.add(mA.get(mN - k).multiply(k));
    }
    return sum;
  }
}

