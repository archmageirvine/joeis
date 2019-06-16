package irvine.oeis.a023;

import java.util.ArrayList;

import irvine.math.z.Z;

/**
 * A023858 <code>a(n) = 1*t(n) + 2*t(n-1) + ... + k*t(n+1-k)</code>, where k <code>= floor((n+1)/2), t = A023531</code>.
 * @author Sean A. Irvine
 */
public class A023858 extends A023531 {

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

