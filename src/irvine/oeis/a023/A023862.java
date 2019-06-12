package irvine.oeis.a023;

import java.util.ArrayList;

import irvine.math.z.Z;
import irvine.oeis.a008.A008578;

/**
 * A023862 <code>a(n) = s(1)t(n)+s(2)t(n-1)+...+s(k)t(n+1-k)</code>, where <code>k=[ (n+1)/2 ], s =</code> (natural numbers), <code>t = (1, p(1), p(2), p(3), ...)</code>.
 * @author Sean A. Irvine
 */
public class A023862 extends A008578 {

  private final ArrayList<Z> mA = new ArrayList<>();
  private int mN = 0;

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

