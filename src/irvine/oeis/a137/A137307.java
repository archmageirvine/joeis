package irvine.oeis.a137;

import irvine.math.z.Z;
import irvine.oeis.a053.A053120;

/**
 * A137307 Triangle reads by rows: T(n,k) = A053120(2*n-1, k) + A053120(2*n, k) for 0 &lt;= k &lt; 2*n.
 * @author Sean A. Irvine
 */
public class A137307 extends A053120 {

  private int mN = 0;
  private int mM = -1;

  @Override
  public Z next() {
    if (++mM > 2 * mN) {
      ++mN;
      mM = 0;
    }
    return triangleElement(2 * mN - 1, mM).add(triangleElement(2 * mN, mM));
  }
}

