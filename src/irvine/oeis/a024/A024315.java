package irvine.oeis.a024;

import java.util.ArrayList;

import irvine.math.z.Z;
import irvine.oeis.a000.A000045;

/**
 * A024315 <code>a(n) = s(1)t(n) + s(2)t(n-1) + ... + s(k)t(n-k+1)</code>, where k <code>= [ n/2 ], s =</code> (natural numbers <code>&gt;= 3), t =</code> (Fibonacci numbers).
 * @author Sean A. Irvine
 */
public class A024315 extends A000045 {

  private final ArrayList<Z> mA = new ArrayList<>();
  {
    mA.add(super.next());
    mA.add(super.next());
  }
  private int mN = 1;

  @Override
  public Z next() {
    mA.add(super.next());
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 1; k <= mN / 2; ++k) {
      sum = sum.add(mA.get(mN + 1 - k).multiply(k + 2));
    }
    return sum;
  }
}
