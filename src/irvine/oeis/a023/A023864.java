package irvine.oeis.a023;

import java.util.ArrayList;

import irvine.math.z.Z;
import irvine.oeis.a000.A000045;

/**
 * A023864 <code>a(n) = s(1)t(n)+s(2)t(n-1)+...+s(k)t(n+1-k)</code>, where <code>k=[ (n+1)/2 ], s =</code> (natural numbers), <code>t = ( F(2), F(3), F(4), ... )</code>.
 * @author Sean A. Irvine
 */
public class A023864 extends A000045 {

  private final ArrayList<Z> mA = new ArrayList<>();
  private int mN = 0;
  {
    super.next();
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

