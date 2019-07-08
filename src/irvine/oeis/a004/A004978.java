package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.a002.A002048;

/**
 * A004978 <code>a(n) =</code> least integer m <code>&gt; a(n-1)</code> such that m <code>- a(n-1) != a(j) - a(k)</code> for all j, k less than n; <code>a(1) = 1, a(2) = 2</code>.
 * @author Sean A. Irvine
 */
public class A004978 extends A002048 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.add(super.next());
    return mA;
  }
}
