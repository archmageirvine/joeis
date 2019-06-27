package irvine.oeis.a024;

import java.util.ArrayList;

import irvine.math.z.Z;
import irvine.oeis.a000.A000045;

/**
 * A024309 <code>a(n) = s(1)t(n) + s(2)t(n-1) + ... + s(k)t(n+1-k)</code>, where <code>k=[ (n+1)/2) ], s =</code> (natural numbers <code>&gt;= 2), t =</code> (Fibonacci numbers).
 * @author Sean A. Irvine
 */
public class A024309 extends A000045 {

  private final ArrayList<Z> mA = new ArrayList<>();
  {
    mA.add(super.next());
  }
  private int mN = 0;

  @Override
  public Z next() {
    mA.add(super.next());
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 1; k <= (mN + 1) / 2; ++k) {
      sum = sum.add(mA.get(mN + 1 - k).multiply(k + 1));
    }
    return sum;
  }
}
