package irvine.oeis.a025;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A025216 [ Sum <code>(s(j) - s(i))^2 ], 1 &lt;= i &lt; j &lt;=</code> n, where <code>s(k) = 1 + 1/2 + ... + 1/k</code>.
 * @author Sean A. Irvine
 */
public class A025216 extends A025212 {

  private int mN = 1;
  private Q mSum = Q.ZERO;

  @Override
  public Z next() {
    final Q h = h(++mN);
    for (int k = 1; k < mN; ++k) {
      mSum = mSum.add(h.subtract(h(k)).square());
    }
    return mSum.floor();
  }
}
